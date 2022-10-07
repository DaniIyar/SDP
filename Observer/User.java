package Observer;

import java.util.List;

public class User implements Customer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> items) {
        System.out.println();

        System.out.println("Hello " + this.name);
        System.out.println("These items are already on sale: ");
        for (String item: items) {
            System.out.println(item);
        }
    }
}
