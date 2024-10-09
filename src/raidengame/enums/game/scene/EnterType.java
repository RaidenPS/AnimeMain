package raidengame.enums.game.scene;

public enum EnterType {
    NONE(0),
    SELF(1),
    GOTO(2),
    JUMP(3),
    OTHER(4),
    BACK(5),
    DUNGEON(6),
    DUNGEON_REPLAY(7),
    GOTO_BY_PORTAL(8),
    SELF_HOME(9),
    OTHER_HOME(10),
    GOTO_RECREATE(11),
    GOTO_BY_TPL(12);

    private final int value;
    EnterType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}