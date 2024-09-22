package raidengame.connection.kcp;

// Imports
import java.net.InetSocketAddress;

public interface KcpTunnel {
    InetSocketAddress getAddress();
    void writeData(byte[] bytes);
    void close();
    int getSrtt();
}