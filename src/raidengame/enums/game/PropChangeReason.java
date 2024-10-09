package raidengame.enums.game;

public enum PropChangeReason {
    NORMAL(0),
    STATUE_RECOVER(1),
    ENERGY_BALL(2),
    ABILITY(3),
    LEVELUP(4),
    ITEM(5),
    AVATAR_CARD(6),
    CITY_LEVELUP(7),
    AVATAR_UPGRADE(8),
    AVATAR_PROMOTE(9),
    PLAYER_ADD_EXP(10),
    FINISH_QUEST(11),
    GM(12),
    MANUAL_ADJUST_WORLD_LEVEL(13);

    private final int value;
    PropChangeReason(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}