package raidengame.enums.gcg;

public enum ActionType {
    INVALID(0),
    SPECIAL_PHASE(1),
    NEXT_PHASE(2),
    DRAW(3),
    REDRAW(4),
    SELECT_ONSTAGE(5),
    ROLL(6),
    REROLL(7),
    ATTACK(8),
    PLAY_CARD(9),
    PASS(10),
    REBOOT(11),
    GAME_OVER(12),
    TRIGGER(13),
    PHASE_EXIT(14),
    CUSTOM(15),
    NOTIFY_COST(16),
    AFTER_OPERATION(17),
    USE_SKILL(18),
    NOTIFY_SKILL_PREVIEW(19),
    PREVIEW_ATTACK(20),
    PREVIEW_AFTER_ATTACK(21),
    SEND_MESSAGE(22),
    WAITING_CHARACTER(23),
    TRIGGER_SKILL(24),
    BEFORE_NEXT_OPERATION(25),
    REMOVE_CHARACTER_CARD(26),
    ONSTAGE_CHECK(27),
    RECORD_BEFORE_OPERATION_DICE_NUM(28),
    CREATE_AUTO_OPERATION(29),
    START_CONTROLLER_TIMER(30),
    USE_VEHICLE_SKILL(31),
    PREVIEW_USE_VEHICLE_SKILL(32);

    private final int value;
    ActionType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}