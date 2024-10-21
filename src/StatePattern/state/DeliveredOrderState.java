package StatePattern.state;


import StatePattern.context.Order;

public class DeliveredOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel. Order already delivered.");
    }
}
