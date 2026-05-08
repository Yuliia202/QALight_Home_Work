package java_hw_63;

public class CoffeeOrder extends Order implements Pricable {
    private CoffeeSize size;

    public CoffeeOrder(CoffeeSize size, int orderNumber, OrderStatus status) {
        super(orderNumber, status);
        this.size = size;
    }

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        if (size == null) return 0;

        switch (size) {
            case SMALL:
                return 200;
            case MEDIUM:
                return 300;
            case LARGE:
                return 400;
            default:
                return 0;
        }
    }
}