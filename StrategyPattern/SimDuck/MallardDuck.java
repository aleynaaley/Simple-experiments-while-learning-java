public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new flyWithWings();
        quackBehaviour = new quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }   
}
