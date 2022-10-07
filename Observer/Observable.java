package Observer;

public interface Observable {
    void subscribe(Customer customer);
    void unsubscribe(Customer customer);
    void sendAll();
}
