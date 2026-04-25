//- (Використовувати оператори if-else-if) Користувачвводить з клавіатури числа:
//Якщо число дорівнює 1, виведення на консоль “Понеділок”;
//Якщо число дорівнює 2,виведення на консоль “Вівторок”;
//Якщо число дорівнює 3, виведення на консоль “Середа”;
//Якщо число дорівнює 4, виведення на консоль “Четвер”;
//Якщо число дорівнює 5, виведення на консоль “П'ятниця”;
//Якщо число дорівнює 6, виведення на консоль “Субота”;
//Якщо число дорівнює 7, то виведення на консоль "Неділя";
//В іншому випадку виводимотекст:"Краще б сьогодні була п'ятниця".

package java_hw_3;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = scanner.nextInt();

        String result = Number(a);
        System.out.println(result);

    }


    public static String Number(int a) {
        if (a == 1) {
            return ("Monday");
        } else if (a == 2) {
            return ("Tuesday");
        } else if (a == 3) {
            return ("Wednesday");
        } else if (a == 4) {
            return ("Thursday");
        } else if (a == 5) {
            return ("Friday");
        } else if (a == 6) {
            return ("Saturday");
        } else if (a == 7) {
            return ("Sunday");

        }
        return "It would be better if today was Friday.";
    }
}
