public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        for (Ranks rank : Ranks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s", rank.getCoefficient(), rank);
            System.out.println();
        }
    }
}