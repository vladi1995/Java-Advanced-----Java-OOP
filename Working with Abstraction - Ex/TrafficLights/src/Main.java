import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lights[] = scanner.nextLine().split(" ");
        int iterations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < lights.length; j++) {
                lights[j] = String.valueOf(Lights.update(Lights.valueOf(lights[j])));
                System.out.print(lights[j] + " ");
            }
            System.out.println();
        }
    }
}