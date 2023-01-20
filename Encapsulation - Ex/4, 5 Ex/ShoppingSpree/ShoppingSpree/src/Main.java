import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new HashMap<>();

        String[] allPeople = scanner.nextLine().split(";");

        for (String singlePerson : allPeople) {
            String[] singlePersonArray = singlePerson.split("=");

            String personName = singlePersonArray[0];
            double personMoney = Double.parseDouble(singlePersonArray[1]);

            try {
                Person person = new Person(personName, personMoney);
                people.put(personName, person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        String[] allProducts = scanner.nextLine().split(";");

        for (String singleProduct : allProducts) {
            String[] singleProductArray = singleProduct.split("=");

            String productName = singleProductArray[0];
            double productCost = Double.parseDouble(singleProductArray[1]);

            try {
                Product product = new Product(productName, productCost);
                products.put(productName, product);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String[] commandSplit = command.split(" ");

            String buyerName = commandSplit[0];
            String buyerProduct = commandSplit[1];

            try {
                people.get(buyerName).buyProduct(products.get(buyerProduct));
                System.out.println(buyerName + " bought " + buyerProduct);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            command = scanner.nextLine();
        }

        people.values().forEach(System.out::println);
    }
}