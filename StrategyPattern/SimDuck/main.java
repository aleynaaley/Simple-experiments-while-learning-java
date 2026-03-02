
public class main {

    public static void main(String[] args) {

        Duck aley = new MallardDuck();
        aley.performFly();
        aley.performQuack();
        aley.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new flyNoWay()); // model ördeğin içinde davranışı değiştiriyoruz 
        model.performFly();
        model.performQuack();
        model.display();
    }
}

/*

output: java main.java 
I am flying!!
Quack
I am a real Mallard duck
I am flying!!
I can't fly
Squeak
I am a model duck
*/