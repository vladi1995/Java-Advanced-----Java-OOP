import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Buyer> arrOfPeople = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] person = scanner.nextLine().split(" ");
            if (person.length == 4) {
                Citizen citizen = new Citizen(person[0], Integer.parseInt(person[1]), person[2], person[3]);
                arrOfPeople.add(citizen);
            } else if (person.length == 3) {
                Rebel rebel = new Rebel(person[0], Integer.parseInt(person[1]), person[2]);
                arrOfPeople.add(rebel);
            }
        }

        String nameOfPerson = scanner.nextLine();
        int totalFood = 0;

        while(!nameOfPerson.equals("End")) {
            for (Buyer person : arrOfPeople) {
                if (person.getName().equals(nameOfPerson)) {
                    person.buyFood();
                }
            }
            nameOfPerson = scanner.nextLine();
        }

        for (Buyer person : arrOfPeople) {
            totalFood += person.getFood();
        }

        System.out.println(totalFood);
    }
}
