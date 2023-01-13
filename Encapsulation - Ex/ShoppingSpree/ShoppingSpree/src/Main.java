import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Person> people = new LinkedHashMap<>();
        Map<String,Product> products = new HashMap<>();

        String[] peopleInput = scanner.nextLine().split(";");

        for (String personData : peopleInput) {
            String[] personParts = personData.split("=");
            String name = personParts[0];
            double money = Double.parseDouble(personParts[1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        String [] productsInput = scanner.nextLine().split(";");

        for (String productData : productsInput) {
            String[] productParts = productData.split("=");
            String name = productParts[0];
            double cost = Double.parseDouble(productParts[1]);
            try {
                Product product = new Product(name, cost);
                products.put(name, product);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String[] nameProduct = command.split(" ");

            String nameOfPerson = nameProduct[0];
            String productOfPerson = nameProduct[1];

            //Person -> Product logic
            //people.get(nameOfPerson).buyProduct(products.get(productOfPerson));

            Person buyer = people.get(nameOfPerson);
            Product productToBuy = products.get(productOfPerson);
            try {
                buyer.buyProduct(productToBuy);
                System.out.printf("%s bought %s%n", nameOfPerson, productOfPerson);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            command = scanner.nextLine();
        }

        people.values().forEach(System.out::println);
    }
}