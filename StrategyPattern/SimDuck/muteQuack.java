
public class muteQuack implements quackBehaviour {
    
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
