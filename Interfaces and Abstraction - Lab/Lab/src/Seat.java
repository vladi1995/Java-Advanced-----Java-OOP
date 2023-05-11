public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer horsePower, String country, Double price) {
        super(model, color, horsePower, country);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nLeon sells for %f", price);
    }
}
