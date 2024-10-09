package raidengame.enums.gcg;

public enum PerformType {
    INVALID(0),
    CARD_EXCHANGE(1),
    FIRST_HAND(2),
    REROLL(3),
    COST_REVISE(4),
    REDRAW(5),
    HISTORY(6),
    BEFORE_HENSHIN(7);

    private final int value;
    PerformType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}