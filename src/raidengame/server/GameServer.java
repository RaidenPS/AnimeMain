package raidengame.server;

// Imports
import raidengame.configuration.ConfigManager;
import raidengame.connection.SessionManager;
import raidengame.connection.PacketHandler;
import raidengame.connection.base.Packet;
import raidengame.game.player.Player;
import com.mongodb.lang.Nullable;
import kcp.highway.ChannelConfig;
import kcp.highway.KcpServer;
import lombok.Getter;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public final class GameServer extends KcpServer implements Iterable<Player> {
    private final InetSocketAddress address;
    private final Map<Integer, Player> players;
    private final PacketHandler packetHandler;

    /**
     * Creates a new instance of GameServer object.
     */
    public GameServer() {
        this.address = new InetSocketAddress(ConfigManager.serverConfig.kcpInfo.gateserverIP, ConfigManager.serverConfig.kcpInfo.gateserverPort);
        this.packetHandler = new PacketHandler(Packet.class);
        this.players = new ConcurrentHashMap<>();

        var channelConfig = new ChannelConfig();
        channelConfig.nodelay(true, ConfigManager.serverConfig.kcpInfo.kcpInterval, 2, true);
        channelConfig.setMtu(ConfigManager.serverConfig.kcpInfo.kcpMtu);
        channelConfig.setSndwnd(ConfigManager.serverConfig.kcpInfo.kcpSndwnd);
        channelConfig.setRcvwnd(ConfigManager.serverConfig.kcpInfo.kcpRcvwnd);
        channelConfig.setTimeoutMillis(ConfigManager.serverConfig.kcpInfo.kcpTimeout);
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(false);
        this.init(SessionManager.getListener(), channelConfig, address);
    }

    /**
     * Receives a Player object by given account ID.
     * @param accountId Given ID.
     * @return The player by given ID.
     */
    @Nullable
    public Player getPlayerByAccountId(String accountId) {
        Optional<Player> playerOpt = getPlayers().values().stream().filter(player -> player.getAccount().getId().equals(accountId)).findFirst();
        return playerOpt.orElse(null);
    }

    /**
     * Returns an iterator of all server players.
     * @return The iterator.
     */
    @Override public Iterator<Player> iterator() {
        return this.players.values().iterator();
    }
}