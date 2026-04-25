//Замінити всі негативні елементи на нуль

package java_hw_3;

import java.util.Arrays;

public class NegativeElements {
    public static void main(String[] args) {
        int[] elements = {-1, -5, -7, -21, 8, 3, 20, 22};
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < 0) {
                elements[i] = 0;
            }

        }
        System.out.println(Arrays.toString(elements));
    }
}
