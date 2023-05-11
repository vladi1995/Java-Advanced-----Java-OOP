public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        Suits[] allSuits = Suits.values();

        for (Suits suit: allSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s", suit.getOrdinalValue(),  suit);
            System.out.println();
        }

    }
}