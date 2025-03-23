package module.first.animal;

public class Fish extends Animal implements ILivingEnvironment {

    @Override
    public void WhereLive() {
        System.out.println("in water");
    }
}
