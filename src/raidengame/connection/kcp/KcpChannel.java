package raidengame.connection.kcp;

public interface KcpChannel {
    void onConnected(KcpTunnel tunnel);
    void handleClose();
    void handleReceive(byte[] bytes);
}
