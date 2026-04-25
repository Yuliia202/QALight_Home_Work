//Оцінка за балами
//Введіть бал (від 0 до 100) та виведіть оцінку:
//90-100: "Відмінно"
//70-89: "Добре"
//50-69: "Задовільно"
//0-49: "Не задовільно"

package java_hw_2;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();
        if (score <= 49) {
            System.out.println("Bad");
        } else if (score <= 69) {
            System.out.println("Not Good");
        } else if (score <= 89) {
            System.out.println("Good");
        } else {
            System.out.println("Perfect");

        }
    }
}
