package raidengame.enums.gcg;

public enum DiceSideElementType {
    INVALID(0),
    CRYO(1),
    HYDERO(2),
    PYRO(3),
    ELECTRO(4),
    GEO(5),
    DENDRO(6),
    ANEMO(7),
    PAIMON(8); // RANDOM

    private final int value;
    DiceSideElementType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}