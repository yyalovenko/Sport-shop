package app.entity;

public class Item {

    protected String name;
    private final String color;
    protected String brand;
    protected double cost;

    public Item (String color) {
        this.color = color;
    }

    public double getCost() {
        return this.cost;
    }

    public String toString() {
        return "Item: " + this.name + ", " +
                "Color: " + this.color + ", Brand: " + this.brand + ", Cost: " + this.cost;
    }
}
