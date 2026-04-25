package java_hw_62;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coffee size: small, medium or large: ");
        String coffeeSize = scanner.nextLine();

        System.out.print("Enter the color of the tea: black, green or herbal: ");
        String teaColor = scanner.nextLine();

        System.out.print("Enter the type of cake: cake, cookie or marshmallow: ");
        String cakeType = scanner.nextLine();

        OrderManager manager = new OrderManager();

        try {
            manager.addOrder(new CoffeeOrder(coffeeSize, 1, "NEW"));
            manager.addOrder(new CoffeeOrder("medium", 2, "NEW"));
            manager.addOrder(new TeaOrder(teaColor, "medium", 3, "NEW"));
            manager.addOrder(new DessertOrder(cakeType, 4, "NEW"));

            manager.addOrder(new CoffeeOrder("small", 1, "NEW"));
        } catch (DuplicateOrderException e) {
            System.out.println("\nError adding order: " + e.getMessage());
        }

        System.out.println("\n--- Detail ---");
        List<Order> allOrders = manager.getOrdersByStatus("NEW");
        for (int i = 0; i < allOrders.size(); i++) {
            allOrders.get(i).printOrderInfo();
        }

        try {
            manager.setOrderStatus(2, "CANCELED");
            System.out.println("\nOrder #2 status changed to CANCELED");

            manager.setOrderStatus(2, "INVALID_STATUS");
        } catch (OrderNotFoundException | InvalidOrderStatusException e) {
            System.out.println("\nStatus update error: " + e.getMessage());
        }

        try {
            manager.removeOrderByNumber(3);
            System.out.println("Order #3 has been removed");

            manager.removeOrderByNumber(99);
        } catch (OrderNotFoundException e) {
            System.out.println("\nRemoval error: " + e.getMessage());
        }

        System.out.println("\n--- Find order #1 ---");
        try {
            Order foundOrder = manager.findOrderByNumber(1);
            foundOrder.printOrderInfo();
        } catch (OrderNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Orders with status NEW ---");
        List<Order> newOrders = manager.getOrdersByStatus("NEW");
        for (int i = 0; i < newOrders.size(); i++) {
            newOrders.get(i).printOrderInfo();
        }

        try {
            double total = manager.calculateTotal(newOrders);
            System.out.println("\nTotal price (only status NEW): " + total + " hrn");

            manager.calculateTotal(new ArrayList<>());
        } catch (NoOrdersException e) {
            System.out.println("\nCalculation error: " + e.getMessage());
        }

        System.out.println("\n--- Order type counts ---");
        Map<String, Integer> typeCounts = manager.getOrderTypeCounts();
        System.out.println("Coffee: " + typeCounts.get("Coffee"));
        System.out.println("Tea: " + typeCounts.get("Tea"));
        System.out.println("Dessert: " + typeCounts.get("Dessert"));
    }
}