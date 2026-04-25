
package java_hw_52;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(double loadCapacity, String name, int speed) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + getName() + " with load capacity " + loadCapacity + " is moving at a speed of " + getSpeed() + " people");
    }


}
