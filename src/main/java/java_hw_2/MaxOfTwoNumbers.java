//Визначення найбільшого з двох чисел
//Введіть два числа та виведіть, яке з них більше (або повідомте, що вони рівні).

package java_hw_2;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("The number1 is more than number2");
        } else if (number2 > number1) {
            System.out.println("The number2 is more than number1");
        } else {
            System.out.println("Numbers are equal");

        }


    }
}
