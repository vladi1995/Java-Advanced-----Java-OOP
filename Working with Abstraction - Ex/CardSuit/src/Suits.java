public enum Suits {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int ordinalValue;

    Suits(int ordinalValue) {
        this.ordinalValue = ordinalValue;
    }

    public int getOrdinalValue() {
        return ordinalValue;
    }
}
