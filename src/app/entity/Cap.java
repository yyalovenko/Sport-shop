package app.entity;

public class Cap extends Item {
    public Cap (String color) {
        super(color);
        this.cost = 1.30;
        this.name = "Cap";
        this.brand = new Brand ("Smart Caps");
    }
}
