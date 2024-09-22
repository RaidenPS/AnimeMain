package raidengame.connection.packets.receive.login;

// Imports
import raidengame.Main;
import raidengame.connection.GameSession;
import raidengame.connection.base.Packet;
import raidengame.connection.base.PacketIds;
import raidengame.connection.base.PacketOpcode;

@PacketOpcode(PacketIds.GetPlayerTokenReq)
public class HandlerGetPlayerTokenReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        Main.getLogger().info("THX FOR PLAYING AnimeGame");
    }
}