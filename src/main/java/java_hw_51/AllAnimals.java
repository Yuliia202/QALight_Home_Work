//Опис задачі:
//Створіть базовий клас Animal із загальними методами:
//eat() і sleep(), які виводять відповідні повідомлення ("Я їм" / "Я сплю").
//Створіть підкласи:
//Bird: додає метод fly() (виводить "Я літаю").
//Fish: додає метод swim() (виводить "Я плаваю").
//Dog: додає метод bark() (виводить "Гав-гав").
//В методі main створіть обєкти цих класів і використайте їхніметоди.

package java_hw_51;

public class AllAnimals {
    public static void main(String[] args) {
        Fish firstFish = new Fish("Salmon");
        Dog firstDog = new Dog("Bulldog");
        Bird firstBird = new Bird("Eagle");

        firstFish.eat();
        firstFish.sleep();
        firstFish.swim();

        firstDog.eat();
        firstDog.sleep();
        firstDog.bark();


        firstBird.eat();
        firstBird.sleep();
        firstBird.fly();

    }
}
