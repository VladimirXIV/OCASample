package question22;

public class Test {
    public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }
    public static void main(String[] args) {
        Product ptr = new Product();
        ptr.price = 200;
        double newPrice = 100;

        Test t = new Test();
        t.updatePrice(ptr, newPrice);
        System.out.println(ptr.price + " : " +  newPrice);
    }
}