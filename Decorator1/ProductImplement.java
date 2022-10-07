package Decorator1;

public class ProductImplement implements Product {
    String item_name = "Personal Computer";
    @Override
    public String decorate() {
        return "Your " + item_name + " will have following hardware: ";
    }
}
