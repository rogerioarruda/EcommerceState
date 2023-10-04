package Model.State;

import Model.Order;

public class SubmitedState extends State{

    public SubmitedState(Order order) {
        super(order);
    }

    @Override
    public String submitOrder() {
        order.changeState(new PaymentState(order));

        return "Order submitted";
    }


    @Override
    public String orderPaused() {
        return null;
    }
}
