package Model.State;

import Model.Order;

public class PaymentState extends State {

    public PaymentState(Order order) {
        super(order);
    }

    @Override
    public String payOrder() {
        order.changeState(new SentToWarehouseState(order));

        return "Order sent to warehouse";
    }

}
