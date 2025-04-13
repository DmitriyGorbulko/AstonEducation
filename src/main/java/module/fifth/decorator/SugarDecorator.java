package module.fifth.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с сахаром";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }
}
