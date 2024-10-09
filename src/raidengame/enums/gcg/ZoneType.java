package raidengame.enums.gcg;

public enum ZoneType {
    INVALID(0),
    DECK(1),
    HAND(2),
    CHARACTER(3),
    MODIFY(4),
    SUMMON(5),
    ASSIST(7),
    ONSTAGE(8),
    RULE(9);

    private final int value;
    ZoneType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}