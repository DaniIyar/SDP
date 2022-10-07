package Decorator;

public abstract class ProductColor implements Product{
    private Product item;

    public ProductColor(Product item) {
        this.item = item;
    }

    @Override
    public String decorate() {
        return this.item.decorate();
    }
}
