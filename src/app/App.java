package app;

public class App {
    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.OrderA();
        System.out.println("Order A");
        System.out.print(orderA.printItems());
        System.out.println("Total cost: " + orderA.getTotalCost() + "\n");

        Order orderB = orderBuilder.OrderB();
        System.out.println("Order B");
        System.out.print(orderB.printItems());
        System.out.println("Total cost: " + orderB.getTotalCost());
    }
}
