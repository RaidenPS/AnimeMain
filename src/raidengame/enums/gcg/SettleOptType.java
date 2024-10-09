package raidengame.enums.gcg;

public enum SettleOptType {
    NONE(0),
    EXIT(1),
    CONTINUE(2),
    RESTART(3);

    private final int value;
    SettleOptType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}