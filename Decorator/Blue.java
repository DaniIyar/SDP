package Decorator;

public class Blue extends ProductColor {
    public Blue(Product item) {
        super(item);
    }

    public String decorate() {
        return super.decorate() + dyeToRed();
    }

    private String dyeToRed() {
        return "    blue";
    }
}
