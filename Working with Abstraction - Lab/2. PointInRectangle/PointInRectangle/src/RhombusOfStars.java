import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }

        for (int i = n-1; i >= 1; i--) {
            printRow(n, i);
        }
    }

    public static void printRow(int n, int i) {
        System.out.println(" ".repeat(n-i) + "* ".repeat(i) + " ".repeat(n-i));
    }
}
