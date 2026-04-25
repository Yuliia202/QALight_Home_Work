
package java_hw_52;

public class Car extends Vehicle {
    private int passengerCapacity;

    public Car(int passengerCapacity, String name, int speed) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + getName() + " is moving at a speed of " + getSpeed() + " km/h with " + passengerCapacity + " people");
    }


}
