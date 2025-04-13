package module.fifth.decorator;

public class CinnamonDecorator extends CoffeeDecorator{
    public CinnamonDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с корицей";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }
}
