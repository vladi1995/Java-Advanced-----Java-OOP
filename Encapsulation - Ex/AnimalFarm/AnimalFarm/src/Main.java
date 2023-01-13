public class Main {
    public static void main(String[] args) {

        try {
            Chicken chicken1 = new Chicken("Chichi", 6);
            System.out.println(chicken1.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}