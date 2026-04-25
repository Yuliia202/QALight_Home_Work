//Створіть клас OrderManager з методом:
//double calculateTotal(Order[] orders), якийповертає загальну суму всіх замовлень у масиві


package java_hw_61;

public class OrderManager {

    public double calculateTotal(Order[] orders) {
        double total = 0;

        for (int i = 0; i < orders.length; i++) {
            total = total + orders[i].getPrice();
        }

        return total;
    }
}
