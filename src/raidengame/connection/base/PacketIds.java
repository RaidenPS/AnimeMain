package raidengame.connection.base;

public final class PacketIds {
    // Ping
    public static final int PingReq = 5983;
    public static final int PingRsp = 22595;

    // Pre-Login
    public static final int GetPlayerTokenReq = 6013;
    public static final int GetPlayerTokenRsp = 24174;
    public static final int PlayerLoginReq = 2422;
    public static final int PlayerLoginRsp = 27771;
    public static final int SetPlayerBornDataReq = 25726;

    // Notifies
    public static final int ServerDisconnectClientNotify = 1387;
}
