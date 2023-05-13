import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phoneNumbersToCall = scanner.nextLine().split(" ");
        String[] sitesToVisit = scanner.nextLine().split(" ");

        List<String> phoneNumbers = new ArrayList<>(Arrays.asList(phoneNumbersToCall));
        List<String> sites = new ArrayList<>(Arrays.asList(sitesToVisit));

        Smartphone smartphone = new Smartphone(phoneNumbers, sites);

        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());
    }
}
