package module.first.animal;

public class Whale extends Mammal implements ILivingEnvironment {

    @Override
    public void WhereLive() {
        System.out.println("in water");
    }
}
