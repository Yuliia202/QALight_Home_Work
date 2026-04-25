//Підрахувати, скільки разів у масиві зустрічається задане число (ввести число з клавіатури via Scanner).

package java_hw_3;

import java.util.Scanner;

public class HowManyTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int[] elements = {1, 5, 7, 5, 21, 8, 3, 20, 22};
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == number) {
                count++;
            }
        }
        System.out.println("Введене число зустрічається " + count + " разів");

    }
}
