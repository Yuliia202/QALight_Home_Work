//Перевірка числа на парність
//Напишіть програму, яка перевіряє, чи введене число є парним або непарним.

package java_hw_2;

import java.util.Scanner;

public class EvenNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("this is an even number");
        } else {
            System.out.println("this is not an even number");
        }


    }
}
