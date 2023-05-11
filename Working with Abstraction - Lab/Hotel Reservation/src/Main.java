import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String allData = scanner.nextLine();
        String[] tokens = allData.split(" ");

        double pricePerDay = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        SeasonType seasonType = SeasonType.valueOf(tokens[2]);
        DiscountType discountType = DiscountType.valueOf(tokens[3]);

        PriceCalculator reservation = new PriceCalculator(pricePerDay, days, seasonType, discountType);

        System.out.printf("%.2f%n", reservation.calculatePrice(pricePerDay, days, seasonType, discountType));
    }
}