package raidengame.connection.packets.send.notify;

// Imports
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.ServerDisconnectClientNotifyOuterClass.ServerDisconnectClientNotify;

public class PacketServerDisconnectClientNotify extends BasePacket {
    public PacketServerDisconnectClientNotify() {
        super(PacketIds.ServerDisconnectClientNotify);

        ServerDisconnectClientNotify proto =
                ServerDisconnectClientNotify.newBuilder()
                    .setData(1)
                    .build();

        this.setData(proto);
    }
}