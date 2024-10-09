package raidengame.enums.game;

public enum MatchType {
    NONE(0),
    DUNGEON(1),
    MP_PLAYER(2),
    MECHANICUS(3),
    GENERAL(4),
    GCG(5);

    private final int value;
    MatchType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}