package StatePattern.state;


import StatePattern.context.Order;

public interface State {
    void payOrder(Order order);
    void shipOrder(Order order);
    void deliverOrder(Order order);
    void cancelOrder(Order order);
}
