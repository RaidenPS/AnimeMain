package raidengame.enums.game.dungeons;

public enum CustomDungeonFinishType {
    PLAY_NORMAL(0),
    PLAY_TRY(1),
    EDIT_TRY(2),
    SELF_PLAY_NORMAL(3);

    private final int value;
    CustomDungeonFinishType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}