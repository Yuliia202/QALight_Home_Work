//Поле orderNumber (номер замовлення)
//Абстрактний метод double getPrice()
//Звичайний метод void printOrderInfo(), який виводить номер замовлення та тип напою

package java_hw_61;

public abstract class Order {
    private int orderNumber;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public abstract double getPrice();

    public void printOrderInfo() {
        System.out.println("Number of order: "+orderNumber +" Type of drink: ");
    }
}
