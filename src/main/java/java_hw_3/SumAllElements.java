//Знайти суму всіх елементів масиву

package java_hw_3;

import java.util.Scanner;

public class SumAllElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int number = scanner.nextInt();
        int[] firstArray = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter the " + i + " arrays element: ");
            firstArray[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sum = sum + firstArray[i];
        }

        System.out.println("Sum of array elements = " + sum);

    }
}

