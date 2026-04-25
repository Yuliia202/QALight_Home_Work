package java_hw_62;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) throws DuplicateOrderException {
        for (Order o : orders) {
            if (o.getOrderNumber() == order.getOrderNumber()) {
                throw new DuplicateOrderException("Замовлення №" + order.getOrderNumber() + " вже існує!");
            }
        }
        orders.add(order);
    }

    public void removeOrderByNumber(int orderNumber) throws OrderNotFoundException {
        boolean removed = orders.removeIf(o -> o.getOrderNumber() == orderNumber);
        if (!removed) {
            throw new OrderNotFoundException("Замовлення №" + orderNumber + " не знайдено для видалення.");
        }
    }

    public Order findOrderByNumber(int orderNumber) throws OrderNotFoundException {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                return order;
            }
        }
        throw new OrderNotFoundException("Замовлення №" + orderNumber + " не знайдено.");
    }

    // САМЕ ЦЬОГО МЕТОДУ ВАМ НЕ ВИСТАЧАЄ НА СКРІНШОТІ:
    public void setOrderStatus(int orderNumber, String status) throws OrderNotFoundException, InvalidOrderStatusException {
        if (!status.equals("NEW") && !status.equals("CANCELED") && !status.equals("COMPLETED")) {
            throw new InvalidOrderStatusException("Статус '" + status + "' невалідний.");
        }
        Order order = findOrderByNumber(orderNumber);
        order.setStatus(status);
    }

    public List<Order> getOrdersByStatus(String status) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getStatus().equalsIgnoreCase(status)) {
                result.add(order);
            }
        }
        return result;
    }

    public double calculateTotal(List<Order> ordersList) throws NoOrdersException {
        if (ordersList == null || ordersList.isEmpty()) {
            throw new NoOrdersException("Список замовлень порожній.");
        }
        double total = 0;
        for (Order order : ordersList) {
            if ("NEW".equals(order.getStatus())) {
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