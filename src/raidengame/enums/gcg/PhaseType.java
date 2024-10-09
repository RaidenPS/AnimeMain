package raidengame.enums.gcg;

public enum PhaseType {
    INVALID(0),
    START(1),
    DRAW(2),
    ON_STAGE(3),
    DICE(4),
    MAIN(5),
    END(6),
    DIE(7),
    FIN(8),
    PRE_MAIN(9),
    REROLL(10),
    REDRAW(11);

    private final int value;
    PhaseType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}