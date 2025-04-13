package module.fifth.adapter;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("IPhone");
        product.setPrice(75000.0);

        double exchangeRate = 75.0;

        IPriceUsa adaptedPrice = new AdapterPrice(product, exchangeRate);
        System.out.println(product.getName() + ": " + product.getPrice() + " руб.");
        System.out.println(product.getName() + ": " + adaptedPrice.getPrice() + "$");
    }
}
