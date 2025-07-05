public class Product {
    private String name;
    private float price;
    private int quantity;

    public float getshipping() {
        return shipping;
    }

    public boolean isIsexpire() {
        return isexpire;
    }

    public float getWeight() {
        return weight;
    }

    private boolean isexpire;

    public void setShipping(float shipping) {
        this.shipping = shipping;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private float shipping;
    private float weight;
public  Product(){}
    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setIsexpire(boolean isexpire) {
        this.isexpire = isexpire;
    }

    /*public void setIsshipping_weighted(boolean isshipping,int weight) {
        this.isshipping = isshipping;
        this.weight = weight;
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
