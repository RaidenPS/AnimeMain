package raidengame.server;

// Imports
import kcp.highway.ChannelConfig;
import raidengame.connection.SessionManager;
import raidengame.connection.PacketHandler;
import raidengame.connection.base.Packet;
import raidengame.game.player.Player;
import kcp.highway.KcpServer;
import lombok.Getter;

import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public final class GameServer extends KcpServer implements Iterable<Player> {
    private final InetSocketAddress address;
    private final Map<Integer, Player> players;
    private final PacketHandler packetHandler;

    public GameServer() {
        this.address = new InetSocketAddress("127.0.0.1", 8882);

        var channelConfig = new ChannelConfig();
        channelConfig.nodelay(true, 3, 2, true);
        channelConfig.setMtu(1400);
        channelConfig.setSndwnd(256);
        channelConfig.setRcvwnd(256);
        channelConfig.setTimeoutMillis(5000); // 5 seconds
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(false);
        //channelConfig.setCrc32Check(true);

        this.init(SessionManager.getListener(), channelConfig, address);
        this.packetHandler = new PacketHandler(Packet.class);
        this.players = new ConcurrentHashMap<>();
    }


    @Override public Iterator<Player> iterator() {
        return this.players.values().iterator();
    }
}