public class Main {
    public static void main(String[] args) {
        Car car = new Car(250, 250);
        car.drive(80);
        System.out.println(car.getFuel());
    }
}