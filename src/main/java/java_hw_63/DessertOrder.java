package java_hw_63;

public class DessertOrder extends Order implements Pricable {
    private DessertType dessertType;

    public DessertOrder(DessertType dessertType, int orderNumber, OrderStatus status) {
        super(orderNumber, status);
        this.dessertType = dessertType;
    }

    public DessertType getDessertType() {
        return dessertType;
    }

    public void setDessertType(DessertType dessertType) {
        this.dessertType = dessertType;
    }

    @Override
    public double getPrice() {
        if (dessertType == null) return 0;

        switch (dessertType) {
            case cake:
                return 15;
            case cookie:
                return 25;
            case marshmallow:
                return 30;
            default:
                return 0;
        }
    }
}