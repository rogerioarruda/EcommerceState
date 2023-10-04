import Model.Order;
import View.UI;

public class EcommerceState {
        public static void main(String[] args) {
            Order order = new Order();
            UI ui = new UI(order);
            ui.init();
        }
}
