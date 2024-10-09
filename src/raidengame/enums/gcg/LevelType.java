package raidengame.enums.gcg;

public enum LevelType {
    NONE(0),
    CONST(1),
    WEEK(2),
    WORLD(3),
    BOSS(4),
    CHARACTER(5),
    BREAK(6),
    QUEST(7),
    GUIDE_GROUP(8),
    OTHER(9),
    JOURNEY(10),
    PVE(11),
    PVE_INFINITE(12),
    PVE_PUZZLE(13);

    private final int value;
    LevelType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}