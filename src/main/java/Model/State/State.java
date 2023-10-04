package Model.State;

import Model.Order;

public abstract class State {
    Order order;

    public State(Order order) {
        this.order = order;
    }

    public String submitOrder(){
        return "Blocked";
    };
    public String payOrder(){
        return "Blocked";
    };
    public String warehouseShips(){
        return "Blocked";
    };
    public String orderReceived(){
        return "Blocked";
    };
    public String orderPaused(){
        return "order paused";
    };
}
