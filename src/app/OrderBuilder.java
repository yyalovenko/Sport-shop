package app;

import app.entity.Cap;
import app.entity.Tshirt;

public class OrderBuilder {

    public Order OrderA() {
        Order order = new Order();
        order.addItem(new Tshirt("red"));
        order.addItem(new Cap("white"));
        return order;
    }

    public Order OrderB() {
        Order order = new Order();
        order.addItem(new Tshirt("blue"));
        order.addItem(new Cap ("black"));
        return order;
    }

    public Order OrderC() {
        Order order = new Order();
        order.addItem(new Tshirt("red"));
        order.addItem(new Cap ("black"));
        return order;
    }

    public Order OrderD() {
        Order order = new Order();
        order.addItem(new Tshirt("blue"));
        order.addItem(new Cap ("white"));
        return order;
    }

}
