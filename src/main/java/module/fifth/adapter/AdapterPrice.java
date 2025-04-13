package module.fifth.adapter;

public class AdapterPrice implements IPriceUsa {
    private IPriceRussia priceRussia;
    private double exchangeRate;

    public AdapterPrice(IPriceRussia priceRussia, double exchangeRate) {
        this.priceRussia = priceRussia;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double getPrice() {
        return priceRussia.getPrice() / exchangeRate;
    }
}