import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameAndToppings = scanner.nextLine().split(" ");

        String pizzaName = nameAndToppings[1];
        int numberOfToppings = Integer.parseInt(nameAndToppings[2]);
        Pizza pizza;

        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        String[] doughInput = scanner.nextLine().split(" ");

        String flourType = doughInput[1];
        String bakingTechnique = doughInput[2];
        double weightInGramsDough = Double.parseDouble(doughInput[3]);

        try {
            Dough dough = new Dough(flourType,bakingTechnique,weightInGramsDough);
            pizza.setDough(dough);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String[] toppingData = command.split(" ");

            String toppingType = toppingData[1];
            double weightInGramsTopping = Double.parseDouble(toppingData[2]);

            try {
                Topping topping = new Topping(toppingType, weightInGramsTopping);
                pizza.addTopping(topping);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }

            command = scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}