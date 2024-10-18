package raidengame.connection.packets.receive.scene;

// Imports
import raidengame.Main;
import raidengame.connection.GameSession;
import raidengame.connection.base.*;
import raidengame.connection.packets.send.notify.PacketPlayerKickNotify;

// Packets
import raidengame.connection.packets.send.notify.PacketEnterScenePeerNotify;
import raidengame.connection.packets.send.scene.PacketEnterSceneReadyRsp;

// Protocol Buffers
import raidengame.cache.protobuf.EnterSceneReadyReqOuterClass.EnterSceneReadyReq;

@PacketOpcode(PacketIds.EnterSceneReadyReq)
public class HandlerEnterSceneReadyReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EnterSceneReadyReq req = EnterSceneReadyReq.parseFrom(header);

        int scene_token = req.getEnterSceneToken();
        if(scene_token == 0) {
            scene_token = session.getPlayer().getEnterSceneToken();
        }
        else {
            if(session.getPlayer().getEnterSceneToken() != scene_token) {
                Main.getLogger().info("EnterSceneReadyReq scene_token mismatched");
                session.send(new PacketPlayerKickNotify());
            }
        }

        session.send(new PacketEnterScenePeerNotify(session.getPlayer()));
        session.send(new PacketEnterSceneReadyRsp(scene_token));
    }
}
