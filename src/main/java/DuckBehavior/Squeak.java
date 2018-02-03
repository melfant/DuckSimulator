package DuckBehavior;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("DuckBehavior.Squeak!");
    }
}
