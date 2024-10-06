package raidengame.connection.base;

public final class PacketRetcodes {
    public static final int RETCODE_SUCC = 0;
    public static final int RETCODE_FAIL = -1;
    public static final int RET_INTERNAL_ERROR = 1;
    public static final int RET_UNKNOWN_ERROR = 2;
    public static final int RET_FREQUENT = 3;
    public static final int RET_BETA_ACCESS_DENIED = 10;
    public static final int RET_GAME_UNDER_MAINTENANCE = 11;
    public static final int RET_ACCOUNT_VEIRFY_ERROR = 12;
    public static final int RET_ACCOUNT_FREEZE = 13;
    public static final int RET_REPEAT_LOGIN = 14;
    public static final int RET_CLIENT_VERSION_ERROR = 15;
    public static final int RET_TOKEN_ERROR = 16;
    public static final int RET_ACCOUNT_NOT_EXIST = 17;
    public static final int RET_WAIT_OTHER_LOGIN = 18;
    public static final int RET_ANOTHER_LOGIN = 19;
    public static final int RET_CLIENT_FORCE_UPDATE = 20;
    public static final int RET_BLACK_UID = 21;
    public static final int RET_MAX_PLAYER = 25;
    public static final int RET_BETA_REGISTER_IS_FULL = 30;
    public static final int RET_CHECKSUM_INVALID = 31;
    public static final int RET_BLACK_REGISTER_IP = 32;
    public static final int RET_BLACK_LOGIN_IP = 37;
    public static final int RET_MINOR_REGISTER_FOBIDDEN = 41;
    public static final int RET_SECURITY_LIBRARY_ERROR = 42;
    public static final int RET_GATE_TICKET_CHECK_ERROR = 43;
}