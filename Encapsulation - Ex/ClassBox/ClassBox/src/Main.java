import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println("Surface area - " + box.calculateSurfaceArea());
            System.out.println("Lateral Surface area - " + box.calculateLateralSurfaceArea());
            System.out.println("Volume - " + box.calculateVolume());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}