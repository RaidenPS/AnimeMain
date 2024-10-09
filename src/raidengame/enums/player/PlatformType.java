package raidengame.enums.player;

public enum PlatformType {
    Editor(0),
    IOS(1),
    Android(2),
    PC(3),
    PS4(4),
    SERVER(5),
    CLOUD_ANDROID(6),
    CLOUD_IOS(7),
    PS5(8),
    CLOUD_WEB(9),
    CLOUD_TV(10),
    CLOUD_MAC(11),
    CLOUD_PC(12),
    CLOUD_THIRD_PARTY_MOBILE(13),
    CLOUD_THIRD_PARTY_PC(14),
    CLOUD_WEB_ANDROID(15),
    CLOUD_WEB_IOS(16),
    CLOUD_WEB_PC(17),
    CLOUD_WEB_MAC(18),
    CLOUD_WEB_TOUCH(19),
    CLOUD_WEB_KEYBOARD(20);

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
        return PC;
    }
}
