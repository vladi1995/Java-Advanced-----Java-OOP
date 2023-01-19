import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Student> listOfPeople = new ArrayList<>();
        Map<String, Student> students = new LinkedHashMap<>();

        while (!command.equals("Exit")) {
            String[] commands = command.split(" ");
            String action = commands[0];
            String nameOfPerson = commands[1];

            if (action.equals("Create")) {
                int ageOfPerson = Integer.parseInt(commands[2]);
                double gradeOfStudent = Double.parseDouble(commands[3]);

                if (!students.containsKey(nameOfPerson)) {
                    Student student = new Student(nameOfPerson, ageOfPerson, gradeOfStudent);
                    students.put(nameOfPerson, student);
                }
            } else if (action.equals("Show")) {
                if (students.containsKey(nameOfPerson)) {
                    System.out.println(students.get(nameOfPerson).toString());
                }
            }
            command = scanner.nextLine();
        }
    }
}
