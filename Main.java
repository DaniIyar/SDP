class Main {

    public static void main(String[] args)
    {
        Shop shop = new Shop();
        User Dan = new User("Dan");
        shop.subscribe(Dan);
        shop.addItem("Smartphone");
        shop.addItem("Laptop");

        User Dana = new User("Dana");
        shop.subscribe(Dana);
        shop.removeItem("Smartphone");
        shop.addItem("Headphones");
    }
}