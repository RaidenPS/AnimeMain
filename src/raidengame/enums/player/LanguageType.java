package raidengame.enums.player;

public enum LanguageType {
    English(1),
    Japanese(2);

    private final int value;
    LanguageType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static LanguageType fromValue(int value) {
        for (LanguageType type : LanguageType.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        return English;
    }
}
