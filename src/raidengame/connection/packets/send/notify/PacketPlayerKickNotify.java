package raidengame.connection.packets.send.notify;

// Imports
import static raidengame.connection.base.PacketRetcodes.RETCODE_SUCC;
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.PlayerKickNotifyOuterClass.PlayerKickNotify;

public class PacketPlayerKickNotify extends BasePacket {
    public PacketPlayerKickNotify() {
        super(PacketIds.PlayerKickNotify);

        PlayerKickNotify proto = PlayerKickNotify.newBuilder()
                .setRetcode(RETCODE_SUCC)
                .build();

        this.setData(proto);
    }
}
