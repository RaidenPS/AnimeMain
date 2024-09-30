package raidengame.connection;

public enum SessionState {
    INACTIVE,
    WAITING_FOR_TOKEN,
    WAITING_FOR_LOGIN,
    PICKING_CHARACTER,
    ACTIVE,
    ACCOUNT_BANNED
}