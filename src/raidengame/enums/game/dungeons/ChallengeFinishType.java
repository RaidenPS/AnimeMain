package raidengame.enums.game.dungeons;

public enum ChallengeFinishType {
    NONE(0),
    FAIL(1),
    SUCCESS(2),
    PAUSE(3);

    private final int value;
    ChallengeFinishType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}