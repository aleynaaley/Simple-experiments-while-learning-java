public abstract class Duck {

    // field , her duck nesnesi için farklı bir fly ve quack davranışı olabilir.
    flyBehaviour flyBehaviour;
    quackBehaviour quackBehaviour;

    public Duck(){} // Constructor

    public void setFlyBehaviour(flyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(quackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    // duck ın fly ve quack davranışı ne ise onu çalıştır demek.

    // değişmeyen davranış o yüzden burada tanımladık
    public void swim() {
        System.out.println("Tüm ördekler yüzebilir.");
    }

    abstract void display(); // her ördek türü kendine özgü tanımlaması için abstract method

}
