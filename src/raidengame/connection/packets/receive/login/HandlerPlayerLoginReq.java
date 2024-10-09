package raidengame.connection.packets.receive.login;

// Imports
import raidengame.configuration.*;
import raidengame.connection.GameSession;
import raidengame.connection.SessionState;
import raidengame.connection.base.*;
import raidengame.game.player.Player;

// Packets
import raidengame.connection.packets.send.login.PacketPlayerLoginRsp;

// Protocol buffers
import raidengame.cache.protobuf.PlayerLoginReqOuterClass.PlayerLoginReq;
import raidengame.misc.classes.Randomizer;

@PacketOpcode(PacketIds.PlayerLoginReq)
public class HandlerPlayerLoginReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = PlayerLoginReq.parseFrom(payload);
        if (!req.getToken().equals(session.getAccount().getToken())) {
            /// Token failed
            session.send(new PacketPlayerLoginRsp(session, req, PacketRetcodes.RET_TOKEN_ERROR, "TOKEN_MISMATCH"));
            return;
        }

        if(ConfigManager.serverConfig.gameInfo.isBeta && !ConfigManager.serverConfig.gameInfo.betaAccountIds.contains(req.getAccountUid())) {
            // Beta only.
            session.send(new PacketPlayerLoginRsp(session, req, PacketRetcodes.RET_BETA_ACCESS_DENIED, "SomebodyGotAccessToBeta"));
            return;
        }

        if(!req.getSecurityLibraryMd5().equals(GameConstants.security_library_md5)) {
            session.send(new PacketPlayerLoginRsp(session, req, PacketRetcodes.RET_SECURITY_LIBRARY_ERROR, "SECURITY_LIBRARY_MD5_HASH_MISMATCH"));
            return;
        }

        if(ConfigManager.serverConfig.isMaintenance) {
            // The server is under maintenance.
            session.send(new PacketPlayerLoginRsp(session));
            return;
        }

        if(!req.getClientVersion().equals(ConfigManager.serverConfig.gameInfo.rawVersion)) {
            // Outdated version
            session.send(new PacketPlayerLoginRsp(session, req, PacketRetcodes.RET_CLIENT_FORCE_UPDATE, "LOGIN_ANOTHER_GAME_VERSION"));
            return;
        }

        Player player = session.getPlayer();
        if (player.getAvatars().getAvatarCount() == 0) {
            if(ConfigManager.serverConfig.gameInfo.enableSwitchCharacters) {
                session.setState(SessionState.PICKING_CHARACTER);
                session.send(new BasePacket(PacketIds.DoSetPlayerBornDataNotify));
            }
            else {
                int avatarId = (Randomizer.randomRange(1, 2) == 2) ? GameConstants.MAIN_CHARACTER_MALE : GameConstants.MAIN_CHARACTER_FEMALE;
                player.addAvatar(avatarId, true, false);
                player.saveDatabase();
            }
            player.onLogin(true);
        }
        else {
            player.onLogin(false);
        }
        session.send(new PacketPlayerLoginRsp(session, req));
    }
}
