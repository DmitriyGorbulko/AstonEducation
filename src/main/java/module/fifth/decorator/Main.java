package module.fifth.decorator;

public class Main {
    public static void main(String[] args) {
        ICoffee simpleCoffee = new Coffee();
        System.out.println(simpleCoffee.getDescription() + ": " + simpleCoffee.getCost() + " рублей");

        ICoffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println(coffeeWithMilkAndSugar.getDescription() + ": " + coffeeWithMilkAndSugar.getCost() + " рублей");

        ICoffee coffeeWithMilkSugarCinnamon = new CinnamonDecorator(coffeeWithMilkAndSugar);
        System.out.println(coffeeWithMilkSugarCinnamon.getDescription() + ": " + coffeeWithMilkSugarCinnamon.getCost() + " рублей");
    }
}
