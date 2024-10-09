package raidengame.connection.packets.send;

// Imports
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.SetPlayerBornDataRspOuterClass.SetPlayerBornDataRsp;

public class PacketSetPlayerBornDataRsp extends BasePacket {
    public PacketSetPlayerBornDataRsp(int status) {
        super(PacketIds.SetPlayerBornDataRsp);

        SetPlayerBornDataRsp proto =
                SetPlayerBornDataRsp.newBuilder()
                        .setRetcode(status)
                        .build();

        this.setData(proto);
    }
}
