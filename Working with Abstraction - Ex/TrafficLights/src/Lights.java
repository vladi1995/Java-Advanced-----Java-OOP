public enum Lights {
    RED, GREEN, YELLOW;

    public static Lights update(Lights state) {
        switch (state) {
            case RED: return GREEN;
            case YELLOW: return RED;
            case GREEN: return YELLOW;
        }
        return null;
    }
}
