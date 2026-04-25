//Перевірка на позитивність/негативність
//Введіть число та визначте, чи воно позитивне, негативне чи нуль.

package java_hw_2;

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number1 = scanner.nextInt();

        if (number1 > 0) {
            System.out.println("It is a positive number");
        } else if (number1 < 0) {
            System.out.println("It is a negative number");
        } else {
            System.out.println("It is a zero");
        }
    }
}
