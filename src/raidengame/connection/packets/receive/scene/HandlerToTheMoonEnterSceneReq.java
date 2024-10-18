package raidengame.connection.packets.receive.scene;

// Imports
import raidengame.connection.GameSession;
import raidengame.connection.base.*;

// Packets
import raidengame.connection.packets.send.scene.PacketToTheMoonEnterSceneRsp;

// Protocol Buffers
import raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq;

@PacketOpcode(PacketIds.ToTheMoonEnterSceneReq)
public class HandlerToTheMoonEnterSceneReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ToTheMoonEnterSceneReq req = ToTheMoonEnterSceneReq.parseFrom(header);

        session.send(new PacketToTheMoonEnterSceneRsp());
    }
}
