package java_hw_63;

import java_hw_63.enums.CoffeeSize;
import java_hw_63.enums.DessertType;
import java_hw_63.enums.OrderStatus;
import java_hw_63.enums.TeaType;
import java_hw_63.exeptions.DuplicateOrderException;
import java_hw_63.exeptions.OrderNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coffee size (SMALL, MEDIUM, LARGE): ");
        CoffeeSize coffeeSize = CoffeeSize.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter the tea type (BLACK, GREEN, HERBAL): ");
        TeaType teaType = TeaType.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter the type of cake (cake, cookie, marshmallow): ");
        DessertType dessertType = DessertType.valueOf(scanner.nextLine().toLowerCase());

        OrderManager manager = new OrderManager();

        try {
            manager.addOrder(new CoffeeOrder(coffeeSize, 1, OrderStatus.NEW));
            manager.addOrder(new CoffeeOrder(CoffeeSize.MEDIUM, 2, OrderStatus.NEW));
            manager.addOrder(new TeaOrder(teaType, 3, OrderStatus.NEW));
            manager.addOrder(new DessertOrder(dessertType, 4, OrderStatus.NEW));

            manager.addOrder(new CoffeeOrder(CoffeeSize.SMALL, 1, OrderStatus.NEW));
        } catch (DuplicateOrderException e) {
            System.out.println("\nError adding order: " + e.getMessage());
        }

        System.out.println("\n--- Detail ---");
        List<Order> allOrders = manager.getOrdersByStatus(OrderStatus.NEW);
        for (Order order : allOrders) {
            order.printOrderInfo();
        }

        try {
            manager.setOrderStatus(2, OrderStatus.CANCELED);
            System.out.println("\nOrder #2 status changed to CANCELED");
        } catch (OrderNotFoundException e) {
            System.out.println("\nStatus update error: " + e.getMessage());
        }

        System.out.println("\n--- Order type counts ---");
        Map<String, Integer> typeCounts = manager.getOrderTypeCounts();
        System.out.println("Coffee: " + typeCounts.get("Coffee") +
                " | Tea: " + typeCounts.get("Tea") +
                " | Dessert: " + typeCounts.get("Dessert"));
    }
}