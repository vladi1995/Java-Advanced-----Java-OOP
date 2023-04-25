import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rectangleCoordinates = scanner.nextLine().split(" ");

        int bottomLeftX = Integer.parseInt(rectangleCoordinates[0]);
        int bottomLeftY = Integer.parseInt(rectangleCoordinates[1]);
        int topRightX = Integer.parseInt(rectangleCoordinates[2]);
        int topRightY = Integer.parseInt(rectangleCoordinates[3]);

        Point bottomLeft = new Point(bottomLeftX, bottomLeftY);
        Point topRight = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= N; i++) {
            String[] pointCoordinates = scanner.nextLine().split(" ");
            int pointX = Integer.parseInt(pointCoordinates[0]);
            int pointY = Integer.parseInt(pointCoordinates[1]);

            Point point = new Point(pointX, pointY);
            System.out.println(rectangle.contains(point));
        }
    }
}
