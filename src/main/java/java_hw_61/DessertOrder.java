package java_hw_61;

public class DessertOrder extends CoffeeOrder {
    private String dessertName;

    public DessertOrder(String dessertName, String size) {
        super(size, 3);
        this.dessertName = dessertName;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setType(String dessertName) {
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
        if ("cake".equalsIgnoreCase(dessertName)) {
            return 15;
        } else if ("cookie".equalsIgnoreCase(dessertName)) {
            return 25;
        } else if ("marshmallow".equalsIgnoreCase(dessertName)) {
            return 30;
        } else {
            return 0;
        }
    }
}
