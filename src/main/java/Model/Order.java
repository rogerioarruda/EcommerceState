package Model;

import Model.State.State;
import Model.State.SubmitedState;

import java.util.List;

public class Order {
    private State state;
    private List<Item> itens;
    private Customer customer;

    public Order() {
        this.state = new SubmitedState(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
