public class PriceCalculator {
    public double pricePerDay;
    public int days;
    private SeasonType season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int days, SeasonType season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatePrice(double pricePerDay, int days, SeasonType season, DiscountType discountType) {
        int multiplier = season.getCoefficient();

        double discountMultiplier = discountType.getDiscount();

        double priceBeforeDiscount = days * pricePerDay * multiplier;
        double discountedAmount = priceBeforeDiscount * discountMultiplier / 100;

        return priceBeforeDiscount - discountedAmount;
    }
}
