public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int ordinalValue;

    Suits(int ordinalValue) {
        this.ordinalValue = ordinalValue;
    }

    public int getOrdinalValue() {
        return ordinalValue;
    }
}
