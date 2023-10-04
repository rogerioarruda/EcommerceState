package Model.State;

import Model.Order;

public class ShippedState extends State {

    public ShippedState(Order order) {
        super(order);
    }

    @Override
    public String orderReceived() {
        order.changeState(new ReceivedByCustomerState(order));

        return "Order Received by customer";
    }

    @Override
    public String orderPaused() {
        return null;
    }
}
