package Model.State;

import Model.Order;

public class SentToWarehouseState extends State {

    public SentToWarehouseState(Order order) {
        super(order);
    }


    @Override
    public String warehouseShips() {
        order.changeState(new ShippedState(order));

        return "Order shipped to customer";
    }
}
