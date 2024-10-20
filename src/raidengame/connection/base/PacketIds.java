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
    public static final int PlayerSetPauseReq = 8076;
    public static final int PlayerSetPauseRsp = 25030;
    public static final int SetPlayerBornDataReq = 25726;
    public static final int SetPlayerBornDataRsp = 26454;

    // Scene
    public static final int GetScenePointReq = 23449;
    public static final int GetSceneAreaReq = 8189;
    public static final int EnterSceneReadyReq = 20524;
    public static final int EnterSceneReadyRsp = 7914;
    public static final int PathfindingEnterSceneReq = 2374;
    public static final int SceneInitFinishReq = 377;
    public static final int ToTheMoonEnterSceneReq = 6116;
    public static final int ToTheMoonEnterSceneRsp = 2333;

    // Social
    public static final int GetPlayerBlacklistReq = 6441;
    public static final int GetPlayerFriendListReq = 21607;

    // Login
    public static final int GetShopReq = 4619;
    public static final int SetOpenStateReq = 24291;
    public static final int GetRegionSearchReq = 27191;
    public static final int PersonalLineAllDataReq = 28403;
    public static final int PersonalLineAllDataRsp = 28577;

    // Notifies
    public static final int ClientAbilityInitFinishNotify = 28413;
    public static final int EnterScenePeerNotify = 9626;
    public static final int DoSetPlayerBornDataNotify = 5351;
    public static final int PlayerEnterSceneNotify = 3595;
    public static final int PlayerKickNotify = 1368;
    public static final int ServerDisconnectClientNotify = 1387;
}