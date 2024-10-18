package raidengame.connection.packets.send.scene;

// Imports
import static raidengame.connection.base.PacketRetcodes.RETCODE_SUCC;
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.ToTheMoonEnterSceneRspOuterClass.ToTheMoonEnterSceneRsp;

public class PacketToTheMoonEnterSceneRsp extends BasePacket {
    public PacketToTheMoonEnterSceneRsp() {
        super(PacketIds.ToTheMoonEnterSceneRsp);

        ToTheMoonEnterSceneRsp proto =
                ToTheMoonEnterSceneRsp.newBuilder()
                        .setRetcode(RETCODE_SUCC)
                        .build();

        this.setData(proto);
    }
}
