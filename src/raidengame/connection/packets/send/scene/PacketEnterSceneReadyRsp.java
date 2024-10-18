package raidengame.connection.packets.send.scene;

// Imports
import static raidengame.connection.base.PacketRetcodes.RETCODE_SUCC;
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp;

public class PacketEnterSceneReadyRsp extends BasePacket {
    public PacketEnterSceneReadyRsp(int scene_token) {
        super(PacketIds.EnterSceneReadyRsp);

        EnterSceneReadyRsp proto =
                EnterSceneReadyRsp.newBuilder()
                    .setRetcode(RETCODE_SUCC)
                    .setEnterSceneToken(scene_token)
                    .build();

        this.setData(proto);
    }
}
