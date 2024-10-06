package raidengame.connection;

// Imports
import raidengame.Main;
import raidengame.connection.base.BasePacket;
import raidengame.connection.events.SendPacketEvent;
import raidengame.connection.kcp.*;
import raidengame.game.player.Player;
import raidengame.game.player.account.Account;
import raidengame.misc.classes.XorAlgo;
import raidengame.server.GameServer;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.Getter;
import lombok.Setter;
import java.net.InetSocketAddress;

// Packets
import raidengame.connection.packets.send.notify.PacketServerDisconnectClientNotify;

public class GameSession implements KcpChannel {
    @Getter private final GameServer server;
    private KcpTunnel tunnel;
    @Getter @Setter private Account account;
    @Getter private Player player;
    @Getter @Setter private SessionState state;

    // Crypto
    @Getter private long encryptSeed;
    private final byte[] encryptKey;
    @Setter private boolean useSecretKey;

    // Integer
    @Getter private int clientTime;
    @Getter private long lastPingTime;
    private int lastClientSeq = 10;

    public GameSession(GameServer server) {
        this.server = server;
        this.state = SessionState.WAITING_FOR_TOKEN;
        this.lastPingTime = System.currentTimeMillis();

        this.encryptSeed = Encryption.ENCRYPT_SEED;
        this.encryptKey = Encryption.ENCRYPT_KEY;
        //this.encryptKey = new byte[4096];
        //this.encryptSeed = Randomizer.generateEncryptKeyAndSeed(this.encryptKey);
    }

    public InetSocketAddress getAddress() {
        try {
            return tunnel.getAddress();
        } catch (Throwable ignore) {
            return null;
        }
    }

    /**
     * Checks if current packet should use secret key as encryption key or dispatch key.
     */
    public boolean useSecretKey() {
        return useSecretKey;
    }

    public synchronized void setPlayer(Player player) {
        this.player = player;
        this.player.setSession(this);
        this.player.setAccount(this.getAccount());
    }

    public boolean isLoggedIn() {
        return this.getPlayer() != null;
    }

    public void updateLastPingTime(int clientTime) {
        this.clientTime = clientTime;
        this.lastPingTime = System.currentTimeMillis();
    }

    public int getNextClientSequence() {
        return ++lastClientSeq;
    }

    /**
     * Sends an packet
     * @param packet The specific packet.
     */
    public void send(BasePacket packet) {
        if (packet.getOpcode() <= 0) {
            return;
        }

        // Header
        if (packet.shouldBuildHeader()) {
            packet.buildHeader(this.getNextClientSequence());
        }

        SendPacketEvent event = new SendPacketEvent(this, packet);
        event.call();
        if (!event.isCanceled()) {
            try {
                packet = event.getPacket();
                var bytes = packet.build();
                if (packet.shouldEncrypt) {
                    XorAlgo.xor(bytes, packet.useDispatchKey() ? Encryption.DISPATCH_KEY : this.encryptKey);
                }
                tunnel.writeData(bytes);
            } catch (Exception ex) {
                Main.getLogger().debug("[Send] Error -> %s", ex.getMessage());
            }
        }
    }

    public void logPacketRetcode(int retcode, String step, String message) {
        Main.getLogger().debug("[" + step + "] " + message + " : " + String.valueOf(retcode));
    }

    @Override
    public void onConnected(KcpTunnel tunnel) {
        this.tunnel = tunnel;
        Main.getLogger().info("[Connect] Connected client -> %s", this.getAddress().toString());
    }

    /**
     * Receives a packet.
     * @param bytes The given packet.
     */
    @Override
    public void handleReceive(byte[] bytes) {
        XorAlgo.xor(bytes, useSecretKey() ? this.encryptKey : Encryption.DISPATCH_KEY);
        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        try {
            while (packet.readableBytes() > 0) {
                if (packet.readableBytes() < 12) { // Length
                    return;
                }
                // Packet sanity check
                int const1 = packet.readShort();
                if (const1 != 17767) {
                    Main.getLogger().error("[Recv] Packet sanity check failure. Invalid const: received %d, expect 17767!", const1);
                    return; // Bad begin magic
                }

                int opcode = packet.readShort();
                int headerLength = packet.readShort();
                int payloadLength = packet.readInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[payloadLength];

                packet.readBytes(header);
                packet.readBytes(payload);

                int const2 = packet.readShort();
                if (const2 != -30293) {
                    Main.getLogger().error("[Recv] Packet sanity check failure. Invalid const: received %d, expect -30293!", const2);
                    return;
                }

                getServer().getPacketHandler().handle(this, opcode, header, payload);
            }
        } catch (Exception ex) {
            Main.getLogger().error("[Recv] Error -> ", ex.getMessage());
        } finally {
            packet.release();
        }
    }

    @Override
    public void handleClose() {
        this.setState(SessionState.INACTIVE);
        Main.getLogger().info("[Connect] Disconnected client -> %s", this.getAddress().toString());
        if (this.isLoggedIn()) {
            Player player = getPlayer();
            player.onLogout();
        }
        this.send(new PacketServerDisconnectClientNotify());
        tunnel = null;
    }

    public void close() {
        tunnel.close();
    }

    public boolean isActive() {
        return getState() == SessionState.ACTIVE;
    }
}
