import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        String[] info;

        String name = "";
        int age;
        String id = "";

        ArrayList<String> ids = new ArrayList<>();

        while(!command.equalsIgnoreCase("End")) {
            info = command.split(" ");

            if (info.length == 3) {
                name = info[0];
                age = Integer.parseInt(info[1]);
                id = info[2];
            } else {
                name = info[0];
                id = info[1];
            }
            ids.add(id);

            command = scanner.nextLine();
        }

        int lastDigitsFakeIds = Integer.parseInt(scanner.nextLine());

        for(String currentId : ids) {
            if (Integer.parseInt(currentId.substring(currentId.length()-3)) == lastDigitsFakeIds) {
                System.out.println(currentId);
            }
        }
    }
}
