import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Birthable> years = new ArrayList<>();

        while (!command.equals("End")) {
            String[] splittedArr = command.split(" ");

            String type = splittedArr[0];

            if (type.equals("Citizen")) {
                Citizen citizen = new Citizen(splittedArr[1], Integer.parseInt(splittedArr[2]), splittedArr[3], splittedArr[4]);
                years.add(citizen);
            } else if (type.equals("Pet")) {
                Pet pet = new Pet(splittedArr[1], splittedArr[2]);
                years.add(pet);
            } else if (type.equals("Robot")) {
                Robot robot = new Robot(splittedArr[1], splittedArr[2]);
            }
            command = scanner.nextLine();
        }

        String specificYear = scanner.nextLine();
        boolean noOutput = true;

        for (Birthable year:years) {
            if (year.getBirthDate().endsWith(specificYear)) {
                System.out.println(year.getBirthDate());
                noOutput = false;
            }
        }

        if (noOutput) {
            System.out.println("<no output>");
        }
    }
}
