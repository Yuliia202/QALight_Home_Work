//Створіть клас Circle з полем радіус (private).
//Додайте методи для обчислення площі та довжини кола.
//Створіть масив з кількох кіл, виведіть їх площі та довжини.

package java_hw_43;

public class ComponentsOfTheCircle {
    private int radius;

    public ComponentsOfTheCircle (int radius){
        this.radius = radius;
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    public double area () {
        return Math.PI * radius*radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
