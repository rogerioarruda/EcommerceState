package Model.State;

import Model.Order;

public class ReceivedByCustomerState extends State {

    public ReceivedByCustomerState(Order order) {
        super(order);
    }

    @Override
    public String orderPaused() {
        return null;
    }
}
