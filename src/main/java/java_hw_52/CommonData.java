//Створіть базовий клас Vehicle з полями:
// name (String), speed(int) і методами:
//move() (виводить "Транспорт рухається зішвидкістю X км/год") і stop() (виводить "Транспорт [name] зупинився").
//Створіть підкласи:
//Car: додає поле passengerCapacity (int) (місткість пасажирів).
//Truck: додає поле loadCapacity (double) (вантажопідйомністьу тоннах).
//Напишіть програму, яка створює об'єкти для кожного класу, задає їхні
//параметри, і демонструє роботу методів move() та stop().
//Для класу Car метод move повинен виводити у консоль –
//“Транспорт [name] рухається зі швидкістю X км/год з [passengerCapacity] кількістю людей”
//Для Track метод move() повинен виводити у консоль – “ Транспорт [name]
// за вантажопідйомністю [loadCapacity] рухається зі швидкістю X км/год”

package java_hw_52;

public class CommonData {
    public static void main(String[] args) {

        Car firstCar = new Car(25, "BMW", 300);
        Truck firstTruck = new Truck(170, "CoolTruck", 78);

        firstCar.move();
        firstCar.stop();

        firstTruck.move();
        firstTruck.stop();
    }
}
