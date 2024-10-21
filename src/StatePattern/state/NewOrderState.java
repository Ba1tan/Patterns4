package StatePattern.state;


import StatePattern.context.Order;

public class NewOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order paid.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship. Order not paid yet.");
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
