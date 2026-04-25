//TeaOrder — має додаткове поле type (наприклад, "black", "green", "herbal") і реалізує метод getPrice()
//(наприклад, різні типи мають різну ціну)
//(Додатково) DessertOrder — маєполе dessertName і свою реалізацію getPrice()

package java_hw_62;

public class TeaOrder extends Order implements Pricable{
    private String type;

    public TeaOrder(String type, String Size, int orderNumber, String status){
        super(orderNumber, status);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice () {
        if ("black".equalsIgnoreCase(type)) {
            return 15;
        } else if ("green".equalsIgnoreCase(type)) {
            return 25;
        } else if ("herbal".equalsIgnoreCase(type)) {
            return 30;
        } else {
            return 0;
        }

    }


}
