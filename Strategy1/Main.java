package Strategy1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment kaspi = new Kaspi();
        String paymentMethod = kaspi.pay();
        System.out.println("You have paid via " + paymentMethod + " successfully");
//        Payment halyk = new Halyk();
//        paymentMethod = halyk.pay();
//        System.out.println("You have paid via " + paymentMethod + " successfully");
    }
}
