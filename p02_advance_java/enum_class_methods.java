
enum Laptops {

    AsusExpertBook(54000), MacBook(80000), LenovoLOQ(67000), AsusVivoBookS16(780000);
    private int price;
    
    private Laptops(int price) {
        this.price = price;
    }

    private Laptops() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class enum_class_methods {
    public static void main(String[] args) {

        for (Laptops lap : Laptops.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
