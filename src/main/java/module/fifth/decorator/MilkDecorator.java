package module.fifth.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с молоком";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }
}
