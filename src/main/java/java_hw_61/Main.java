//Створіть масив з різних замовлень (наприклад, 2 кави, 1 чай, 1 десерт)
//Для кожного замовлення викличте printOrderInfo()
//Порахуйте і виведіть загальну суму замовлень через метод calculateTotal() класу OrderManager

package java_hw_61;

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

        CoffeeOrder coffee = new CoffeeOrder(coffeeSize, 1);
        TeaOrder tea = new TeaOrder(teaColor, "medium", 2);
        DessertOrder dessert = new DessertOrder(cakeType, "small");

        Order[] orders = { coffee, tea, dessert };

        OrderManager manager = new OrderManager();
        double total = manager.calculateTotal(orders);

        System.out.println("Total price for all orders: " + total + " hrn");
    }
}
