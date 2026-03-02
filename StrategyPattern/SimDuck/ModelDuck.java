public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new flyWithWings();
        quackBehaviour = new squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
