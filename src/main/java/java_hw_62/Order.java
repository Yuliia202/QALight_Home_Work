//Поле orderNumber (номер замовлення)
//Абстрактний метод double getPrice()
//Звичайний метод void printOrderInfo(), який виводить номер замовлення та тип напою

package java_hw_62;

public abstract class Order implements Pricable, Printable {
    private int orderNumber;
    private String status;

    public Order(int orderNumber, String status) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String status() {
        if ("CANCELED".equalsIgnoreCase(this.status)) {
            return "CANCELED";
        } else if ("COMPLETED".equalsIgnoreCase(this.status)) {
            return "COMPLETED";
        } else {
            return "NEW";
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Type: " + this.getClass().getSimpleName() +
                " | Number: " + orderNumber +
                " | Status: " + status());
    }
}