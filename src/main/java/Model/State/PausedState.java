package Model.State;

import Model.Order;

public class PausedState extends State {

    public PausedState(Order order) {
        super(order);
    }

    @Override
    public String submitOrder() {
        return null;
    }

    @Override
    public String payOrder() {
        return null;
    }


    @Override
    public String warehouseShips() {
        return null;
    }

    @Override
    public String orderReceived() {
        return null;
    }

    @Override
    public String orderPaused() {
        return null;
    }
}
