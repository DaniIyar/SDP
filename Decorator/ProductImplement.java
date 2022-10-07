package Decorator;

public class ProductImplement implements Product {
    String item_name = "Laptop";
    @Override
    public String decorate() {
        return item_name + " is available in following colors:";
    }
}
