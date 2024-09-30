package raidengame.enums.player;

public enum PlatformType {
    Editor(0),
    IOS(1),
    Android(2),
    PC(3),
    WEB(4),
    WAP(5),
    PS4(6),
    CLOUD_ANDROID(8),
    CLOUD_PC(9),
    CLOUD_IOS(10),
    PS5(11),
    MACOS(12),
    CLOUD_MACOS(13);

    private final int value;
    PlatformType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static PlatformType fromValue(int value) {
        for (PlatformType type : PlatformType.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
