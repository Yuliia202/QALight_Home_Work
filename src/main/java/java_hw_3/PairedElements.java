//Порахувати кількість парних елементів в масиві
package java_hw_3;

public class PairedElements {
    public static void main(String[] args) {
        int[] elements = {1, 5, 7, 21, 8, 3, 20, 22};
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of the paired elements: " + count);
    }
}
