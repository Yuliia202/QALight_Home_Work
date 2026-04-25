//Створіть клас Circle з полем радіус (private).
//Додайте методи для обчислення площі та довжини кола.
//Створіть масив з кількох кіл, виведіть їх площі та довжини.

package java_hw_43;

public class Circle {
    public static void main(String[] args) {
        ComponentsOfTheCircle[] circles = {
                new ComponentsOfTheCircle(5),
                new ComponentsOfTheCircle(10),
                new ComponentsOfTheCircle(25)
        };


        for (int i = 0; i < circles.length; i++) {
            System.out.println("Area: " + circles[i].area());
            System.out.println("Length: " + circles[i].circumference());
            System.out.println("---");
        }


    }


}
