package raidengame.enums.gcg;

public enum GameType {
    NONE(0),
    GM(1),
    MATCH(2),
    PVP(3),
    TAVERN_CHALLENGE(4),
    CONST_CHALLENGE(5),
    WORLD_CHALLENGE(6),
    BOSS_CHALLENGE(7),
    WEEK_CHALLENGE(8),
    BREAK_CHALLENGE(9),
    QUEST(10),
    GUIDE_GROUP(11),
    OTHER(12),
    ACTIVITY_JOURNEY(13),
    PVE_ACTIVITY(14),
    ARENA(15),
    ACTIVITY_PVE_INFINITE(16),
    ACTIVITY_PVE_PUZZLE(17);

    private int value;
    GameType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}