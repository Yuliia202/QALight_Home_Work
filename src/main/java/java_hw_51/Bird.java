package java_hw_51;

public class Bird extends Animal{
    private String bird;

    public Bird (String bird) {
        this.bird =bird;
    }

    public String getBird () { return bird; }
    public void setBird(String bird) { this.bird = bird; }

    public void fly() {
        System.out.println("I'm flying");
    }
}
