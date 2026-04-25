//Знайти максимальнйи елемент в масиві

package java_hw_3;

import java.util.Scanner;

public class MaxElementsInArray {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int number = scanner1.nextInt();
        int[] firstArray = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter the " + i + " arrays element: ");
            firstArray[i] = scanner1.nextInt();
        }

        int max = firstArray[0];

        for (int i = 1; i < number; i++) {
            max = Math.max(max, firstArray[i]);
        }

        System.out.println("Max element = " + max);

    }
}
