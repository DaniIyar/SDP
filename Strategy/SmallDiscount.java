package Strategy;

public class SmallDiscount implements Discount {
    @Override
    public double applyDiscount(int costOriginal) {
        return 0.9 * costOriginal;
    }
}