package raidengame.enums.game.world;

public enum PlayerDieType {
    NONE(0),
    KILL_BY_MONSTER(1),
    KILL_BY_GEAR(2),
    FALL(3),
    DRAWN(4),
    ABYSS(5),
    GM(6),
    CLIMATE_COLD(7),
    STORM_LIGHTING(8),
    DIRTY_WATER_EROSION(9),
    LIQUID_PHLOGISTON(10);

    private final int value;
    PlayerDieType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}