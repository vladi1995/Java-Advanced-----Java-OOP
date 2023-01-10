import animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("Beast!")) {
            String[] nameAgeGender = scanner.nextLine().split(" ");

            String name = nameAgeGender[0];
            int age = Integer.parseInt(nameAgeGender[1]);
            String gender = "";
            try {
                switch(command) {
                    case "Dog":
                        gender = nameAgeGender[2];
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        break;
                    case "Cat":
                        gender = nameAgeGender[2];
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        break;
                    case "Frog":
                        gender = nameAgeGender[2];
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }


            command = scanner.nextLine();
        }
    }
}