package raidengame.connection.packets.receive.login;

// Imports
import raidengame.Main;
import raidengame.configuration.*;
import raidengame.connection.Encryption;
import raidengame.connection.GameSession;
import raidengame.connection.SessionState;
import raidengame.connection.base.*;
import raidengame.database.DatabaseHelper;
import raidengame.game.player.Player;
import raidengame.misc.classes.CustomPair;

// Packets
import raidengame.connection.packets.send.login.PacketGetPlayerTokenRsp;

// Protocol buffers
import raidengame.cache.protobuf.GetPlayerTokenReqOuterClass.GetPlayerTokenReq;
import raidengame.server.events.game.PlayerCreationEvent;

@PacketOpcode(PacketIds.GetPlayerTokenReq)
public class HandlerGetPlayerTokenReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = GetPlayerTokenReq.parseFrom(payload);
        var account = DatabaseHelper.authenticateAccount(req.getAccountUid(), req.getAccountToken());
        if(account == null) {
            // Can't receive the token from request.
            session.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_ACCOUNT_NOT_EXIST, "AccountNotExist", req));
            return;
        }

        if(req.getMinorsRegMinAge() > 0 && req.getMinorsRegMinAge() < GameConstants.MINIMUM_MINOR_AGE) {
            // Kids goes away.
            session.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_MINOR_REGISTER_FOBIDDEN, "Underage", req));
            return;
        }

        if(!req.getConnectGateTicket().equals(GameConstants.connect_gate_ticket)) {
            // Connection from fake region.
            session.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_GATE_TICKET_CHECK_ERROR, "ConnectGateTicketMismatch", req));
            return;
        }

        if(ConfigManager.serverConfig.gameInfo.isBeta && !ConfigManager.serverConfig.gameInfo.betaAccountIds.contains(req.getAccountUid())) {
            // Beta only.
            session.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_BETA_ACCESS_DENIED, "SomebodyGotAccessToBeta", req));
            return;
        }

        session.setAccount(account);
        var exists = Main.getGameServer().getPlayerByAccountId(account.getId());
        if (exists != null) {
            // Another session was found.
            var existsSession = exists.getSession();
            if (existsSession != session) {
                exists.onLogout();
                if(session.getState() == SessionState.WAITING_FOR_LOGIN) {
                    existsSession.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_WAIT_OTHER_LOGIN, "LoginSessionOnAnotherDevice", req));
                }
                else {
                    existsSession.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_REPEAT_LOGIN, "LoginDuplication", req));
                }
                return;
            }
        }

        if (Main.getGameServer().getPlayers().size() >= ConfigManager.serverConfig.gameInfo.maxPlayers) {
            // Reached maximum players in the game server.
            session.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_MAX_PLAYER, "MaxPlayersReached", req));
            return;
        }

        if(session.getAccount().isSuspended()) {
            // Checks if the account is banned permanently.
            session.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_ACCOUNT_FREEZE, "AccountPermBannedLogin", req));
            return;
        }

        var event = new PlayerCreationEvent(session, Player.class);
        event.call();
        var player = DatabaseHelper.getPlayerByAccount(account, event.getPlayerClass());
        if (player == null) {
            player = event.getPlayerClass().getDeclaredConstructor(GameSession.class).newInstance(session);
            DatabaseHelper.generatePlayerUid(player, 0);
        }

        session.setPlayer(player);
        if (session.getAccount().isBanned()) {
            session.send(new PacketGetPlayerTokenRsp(session, req, account.getBanEndTime(), account.getBanReason()));
            return;
        }

        player.loadDatabase();
        session.setState(SessionState.WAITING_FOR_LOGIN);
        if (req.getKeyId() > 0) {
            // init encryption
            session.setUseSecretKey(true);
            CustomPair<String, String> signature = Encryption.prepareRegionLoginSignature(session.getEncryptSeed(), req.getClientRandKey(), req.getKeyId());
            if(signature != null) {
                // Success
                session.send(new PacketGetPlayerTokenRsp(session, signature.getKey(), signature.getValue(), req));
            }
            else {
                // Encryption failed.
                session.send(new PacketGetPlayerTokenRsp(session, PacketRetcodes.RET_ACCOUNT_VEIRFY_ERROR, "Signature failure", req));
            }
        }
        else {
            // Encryption is unavailable, sending without encrypt.
            session.send(new PacketGetPlayerTokenRsp(session, req));
        }
    }
}