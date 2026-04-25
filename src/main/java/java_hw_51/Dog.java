package java_hw_51;

public class Dog extends Animal {
    private String dog;

    public Dog (String dog) {
        this.dog = dog;
    }

    public String getDog () { return dog; }
    public void setDog(String dog) { this.dog = dog; }

    public void bark() {
        System.out.println("I'm barking");
    }
}
