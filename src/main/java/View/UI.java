package View;

import Model.Order;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Order order;
    private static JTextField textField = new JTextField();

    public UI(Order order) {
        this.order = order;
    }

    public void init() {
        JFrame frame = new JFrame("Ecommerce");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        // Context delegates handling user's input to a state object. Naturally,
        // the outcome will depend on what state is currently active, since all
        // states can handle the input differently.
        JButton submit = new JButton("Submit Order");
        submit.addActionListener(e -> textField.setText(order.getState().submitOrder()));
        JButton pay = new JButton("Pay order");
        pay.addActionListener(e -> textField.setText(order.getState().payOrder()));
        JButton ship = new JButton("Ship order");
        ship.addActionListener(e -> textField.setText(order.getState().warehouseShips()));
        JButton receive = new JButton("Receive Order");
        receive.addActionListener(e -> textField.setText(order.getState().orderReceived()));
        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(submit);
        buttons.add(pay);
        buttons.add(ship);
        buttons.add(receive);
    }
}