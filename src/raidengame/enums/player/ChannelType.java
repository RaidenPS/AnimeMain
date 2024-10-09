package raidengame.enums.player;

public enum ChannelType {
    NONE(0),
    Default(1),
    Xiaomi(11),
    Coolpad(12),
    YYB(13),
    Bili(14),
    Huawei(15),
    Meizu(16),
    CHANNEL_360(17),
    Oppo(18),
    Vivo(19),
    UC(20),
    Lenovo(22),
    Jinli(23),
    Baidu(25),
    Dangle(26);

    private final int value;
    ChannelType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ChannelType fromValue(int value) {
        for (ChannelType type : ChannelType.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        return Default;
    }
}
