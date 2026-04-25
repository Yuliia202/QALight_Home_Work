package java_hw_51;

public class Fish extends Animal {
    private String fish;

    public Fish(String fish) {
        this.fish = fish;
    }

    public String getFish () { return fish; }
    public void setFish(String bird) { this.fish = fish; }

    public void swim() {
        System.out.println("I'm swimming");
    }
}
