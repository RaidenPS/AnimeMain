package raidengame.connection.packets.send;

// Imports
import static raidengame.connection.base.PacketRetcodes.RETCODE_SUCC;
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.PingRspOuterClass.PingRsp;

public class PacketPingRsp extends BasePacket {
    public PacketPingRsp(int clientSeq, int time) {
        super(PacketIds.PingRsp, clientSeq);

        PingRsp proto =
                PingRsp.newBuilder()
                    .setRetcode(RETCODE_SUCC)
                    .setClientTime(time)
                    .build();

        this.setData(proto);
    }
}
