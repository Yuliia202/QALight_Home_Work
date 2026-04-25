//Користувач вводить з клавіатури три цілі значення. На екран виводиться інформація,
// чи можна з цих сторінпобудувати трикутник. (Необхідно згадати правило побудови трикутника з трьох сторін).

package java_hw_3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        String result = TriangleCanBeCreated(a, b, c);
        System.out.println(result);

    }


    public static String TriangleCanBeCreated(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return ("You can create a triangle");
        }

        return ("You cannot create a triangle");
    }
}
