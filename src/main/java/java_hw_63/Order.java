//Поле orderNumber (номер замовлення)
//Абстрактний метод double getPrice()
//Звичайний метод void printOrderInfo(), який виводить номер замовлення та тип напою

package java_hw_63;

public abstract class Order implements Pricable, Printable {
    private int orderNumber;
    private OrderStatus status;

    public Order(int orderNumber, OrderStatus status) {
        this.orderNumber = orderNumber;
        this.status = status;
    }

    public abstract double getPrice();

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    // Оновлений геттер
    public OrderStatus getStatus() {
        return status;
    }

    // Оновлений сеттер
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /* Метод status() більше не потрібен, оскільки ми позбулися String.
       Enum автоматично коректно виводиться при друку.
    */

    @Override
    public void printOrderInfo() {
        System.out.println("Type: " + this.getClass().getSimpleName() +
                " | Number: " + orderNumber +
                " | Status: " + status);
    }
}