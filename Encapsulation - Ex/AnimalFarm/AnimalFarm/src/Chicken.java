public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name.length() < 1 || name.trim().isEmpty() || name == null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (this.age <= 5) {
            return 2;
        } else if (this.age <= 11) {
            return 1;
        }
        return 0.75;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %f eggs per day.", this.name, this.age, this.productPerDay());
    }
}
