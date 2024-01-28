package app;

import app.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Item> items = new ArrayList<>();
    private double totalCost = 0;

    public void addItem (Item item) {
        items.add(item);
        this.totalCost += item.getCost();
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    public StringBuilder printItems() {
        StringBuilder str = new StringBuilder();
        for (Item item: items) {
            str.append(item.toString()).append("\n");
        }
        return str;
    }

}
