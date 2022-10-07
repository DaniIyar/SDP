package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter original cost of item:");
        int costOriginal = scanner.nextInt();

        Discount half = new HalfDiscount();
        double discountedCost = half.applyDiscount(costOriginal);
        System.out.println("Cost with half discount: " + discountedCost);
        Discount small = new SmallDiscount();
        discountedCost = small.applyDiscount(costOriginal);
        System.out.println("Cost with small discount: " + discountedCost);
    }
}
