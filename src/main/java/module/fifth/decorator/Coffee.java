package module.fifth.decorator;

public class Coffee implements ICoffee{
    @Override
    public String getDescription() {
        return "Кофе";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
