package raidengame.connection;

// Imports
import raidengame.Main;
import raidengame.connection.kcp.KcpTunnel;
import raidengame.connection.utils.Utils;
import raidengame.server.GameServer;
import io.netty.channel.DefaultEventLoop;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.net.InetSocketAddress;
import java.util.concurrent.ConcurrentHashMap;
import kcp.highway.*;
import lombok.Getter;

public class SessionManager {
    @Getter private static final DefaultEventLoop logicThread = new DefaultEventLoop();
    private static final ConcurrentHashMap<Ukcp, GameSession> sessions = new ConcurrentHashMap<>();
    @Getter private static final KcpListener listener = new KCPListener();

    public static class KCPListener implements KcpListener {
        @Override
        public void onConnected(Ukcp ukcp) {
            int times = 0;
            GameServer server = Main.getGameServer();
            while (server == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    ukcp.close();
                    return;
                }
                if (times++ > 5) {
                    ukcp.close();
                    return;
                }
                server = Main.getGameServer();
            }
            var conversation = new GameSession(server);
            conversation.onConnected(
                    new KcpTunnel() {
                        @Override
                        public InetSocketAddress getAddress() {
                            return ukcp.user().getRemoteAddress();
                        }

                        @Override
                        public void writeData(byte[] bytes) {
                            ByteBuf buf = Unpooled.wrappedBuffer(bytes);
                            ukcp.write(buf);
                            buf.release();
                        }

                        @Override
                        public void close() {
                            ukcp.close();
                        }

                        @Override
                        public int getSrtt() {
                            return ukcp.srtt();
                        }
                    });
            sessions.put(ukcp, conversation);
        }

        @Override
        public void handleReceive(ByteBuf buf, Ukcp kcp) {
            var byteData = Utils.byteBufToArray(buf);
            logicThread.execute(
                    () -> {
                        try {
                            var conversation = sessions.get(kcp);
                            if (conversation != null) {
                                conversation.handleReceive(byteData);
                            }
                        } catch (Exception e) {
                            Main.getLogger().error(String.format("Unable to receive a packet from kcp. Exception: %s", e.getMessage()));
                        }
                    });
        }

        @Override
        public void handleException(Throwable ex, Ukcp ukcp) {}

        @Override
        public void handleClose(Ukcp ukcp) {
            GameSession conversation = sessions.get(ukcp);
            if (conversation != null) {
                conversation.handleClose();
                sessions.remove(ukcp);
            }
        }
    }
}
