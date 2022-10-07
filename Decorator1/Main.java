package Decorator1;

public class Main {
    public static void main(String[] args) {
        ProductImplement productImplement = new ProductImplement();

        Product product = new Memory(new Memory(new RAM(new ProductImplement())));
        System.out.println(product.decorate());
    }
}
