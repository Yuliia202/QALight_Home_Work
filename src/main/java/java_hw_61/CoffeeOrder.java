//Створіть класи-нащадки:
//CoffeeOrder — має додаткове поле size (наприклад, "small", "medium", "large") і реалізуємо метод
//getPrice() (наприклад, ціна залежить відрозміру)


package java_hw_61;

public class CoffeeOrder extends Order {
    private String size;

    public CoffeeOrder(String size, int orderNumber) {
        super(orderNumber);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public double getPrice() {
        if ("small".equalsIgnoreCase(size)) {
            return 200;
        } else if ("medium".equalsIgnoreCase(size)) {
            return 300;
        } else if ("large".equalsIgnoreCase(size)) {
            return 400;
        } else {
            return 0;
        }

    }
}
