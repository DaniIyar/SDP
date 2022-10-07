package Decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductImplement productImplement = new ProductImplement();

        Product product = new Blue(new Red(new ProductImplement()));
        System.out.println(product.decorate());
    }
}
