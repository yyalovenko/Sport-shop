package app;

import app.entity.Cap;
import app.entity.Tshirt;

public class OrderBuilder {

    public Order orderA() {
        Order order = new Order();
        order.addItem(new Tshirt("red"));
        order.addItem(new Cap("white"));
        return order;
    }

    public Order orderB() {
        Order order = new Order();
        order.addItem(new Tshirt("blue"));
        order.addItem(new Cap ("black"));
        return order;
    }

}
