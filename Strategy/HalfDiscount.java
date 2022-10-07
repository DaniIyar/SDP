package Strategy;

public class HalfDiscount implements Discount {
    @Override
    public double applyDiscount(int costOriginal) {
        return 0.5 * costOriginal;
    }
}
