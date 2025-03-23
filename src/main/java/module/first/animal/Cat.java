package module.first.animal;

public class Cat extends  Mammal implements IWool{
    @Override
    public void HasWool() {
        System.out.println("have wool");
    }
}
