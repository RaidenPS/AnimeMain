package raidengame.connection.packets.receive.game;

// Imports
import raidengame.connection.GameSession;
import raidengame.connection.base.*;
import raidengame.game.player.Player;

// Packets
import raidengame.connection.packets.send.game.PacketPlayerSetPauseRsp;

// Protocol buffers
import raidengame.cache.protobuf.PlayerSetPauseReqOuterClass.PlayerSetPauseReq;

@PacketOpcode(PacketIds.PlayerSetPauseReq)
public class HandlerPlayerSetPauseReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PlayerSetPauseReq req = PlayerSetPauseReq.parseFrom(header);
        Player player = session.getPlayer();

        if (player.isInMultiplayer()) {
            // You can't pause the game in multiplayer world.
            session.send(new PacketPlayerSetPauseRsp(PacketRetcodes.RETCODE_FAIL));
        } else {
            player.getWorld().setPaused(req.getIsPaused());
            session.send(new PacketPlayerSetPauseRsp(PacketRetcodes.RETCODE_SUCC));
        }
    }
}