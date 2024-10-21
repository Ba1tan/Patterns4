package StatePattern.state;


import StatePattern.context.Order;

public class PaidOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order shipped.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver. Order not shipped yet.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(null);
    }
}
