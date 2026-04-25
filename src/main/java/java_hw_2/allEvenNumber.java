//Вивести парні числа від 1 до 20

package java_hw_2;

public class allEvenNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
