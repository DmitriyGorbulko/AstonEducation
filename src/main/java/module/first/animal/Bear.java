package module.first.animal;

public class Bear extends Mammal implements IWool{
    @Override
    public void HasWool() {
        System.out.println("Has wool");
    }
}
