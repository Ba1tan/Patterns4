package StatePattern.context;


import StatePattern.state.NewOrderState;
import StatePattern.state.State;

public class Order {
    private State state;

    public Order() {
        state = new NewOrderState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void payOrder() {
        state.payOrder(this);
    }

    public void shipOrder() {
        state.shipOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
