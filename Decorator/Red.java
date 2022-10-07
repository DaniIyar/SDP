package Decorator;

public class Red extends ProductColor {
    public Red(Product item) {
        super(item);
    }

    public String decorate() {
        return super.decorate() + dyeToRed();
    }

    private String dyeToRed() {
        return "    red";
    }
}
