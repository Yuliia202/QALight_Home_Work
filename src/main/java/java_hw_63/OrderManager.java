package java_hw_63;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) throws DuplicateOrderException {
        for (Order o : orders) {
            if (o.getOrderNumber() == order.getOrderNumber()) {
                throw new DuplicateOrderException("Order №" + order.getOrderNumber() + " already exist!");
            }
        }
        orders.add(order);
    }

    public void removeOrderByNumber(int orderNumber) throws OrderNotFoundException {
        boolean removed = orders.removeIf(o -> o.getOrderNumber() == orderNumber);
        if (!removed) {
            throw new OrderNotFoundException("Order №" + orderNumber + " not found for removing.");
        }
    }

    public Order findOrderByNumber(int orderNumber) throws OrderNotFoundException {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                return order;
            }
        }
        throw new OrderNotFoundException("Order №" + orderNumber + " not found.");
    }

    public void setOrderStatus(int orderNumber, OrderStatus status) throws OrderNotFoundException {
        Order order = findOrderByNumber(orderNumber);
        order.setStatus(status);
    }

    public List<Order> getOrdersByStatus(OrderStatus status) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getStatus() == status) {
                result.add(order);
            }
        }
        return result;
    }

    public double calculateTotal(List<Order> ordersList) throws NoOrdersException {
        if (ordersList == null || ordersList.isEmpty()) {
            throw new NoOrdersException("List of orders is empty.");
        }
        double total = 0;
        for (Order order : ordersList) {
            if (OrderStatus.NEW == order.getStatus()) {
                total += order.getPrice();
            }
        }
        return total;
    }

    public Map<String, Integer> getOrderTypeCounts() {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Coffee", 0);
        counts.put("Tea", 0);
        counts.put("Dessert", 0);

        for (Order order : orders) {
            if (order instanceof CoffeeOrder) counts.put("Coffee", counts.get("Coffee") + 1);
            else if (order instanceof TeaOrder) counts.put("Tea", counts.get("Tea") + 1);
            else if (order instanceof DessertOrder) counts.put("Dessert", counts.get("Dessert") + 1);
        }
        return counts;
    }
}