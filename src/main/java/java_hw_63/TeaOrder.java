package java_hw_63;

import java_hw_63.enums.OrderStatus;
import java_hw_63.enums.TeaType;

public class TeaOrder extends Order implements Pricable {
    private TeaType type;

    public TeaOrder(TeaType type, int orderNumber, OrderStatus status) {
        super(orderNumber, status);
        this.type = type;
    }

    public TeaType getType() {
        return type;
    }

    public void setType(TeaType type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        if (type == null) return 0;

        switch (type) {
            case BLACK:
                return 15;
            case GREEN:
                return 25;
            case HERBAL:
                return 30;
            default:
                return 0;
        }
    }
}