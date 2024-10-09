package raidengame.enums.gcg;

public enum SkillHPChangeType {
    NONE(0),
    DAMAGE(1),
    HEAL(2);

    private final int value;
    SkillHPChangeType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}