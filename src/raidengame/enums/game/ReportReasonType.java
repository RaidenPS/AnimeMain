package raidengame.enums.game;

public enum ReportReasonType {
    NONE(0),
    DECEPTIVE_ADS(1),
    ABUSING(2),
    CHEAT(3),
    POLITICAL(4),
    OTHER(5),
    HOME(6);

    private final int value;
    ReportReasonType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}