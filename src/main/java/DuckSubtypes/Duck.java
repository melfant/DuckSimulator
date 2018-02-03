package DuckSubtypes;

import DuckBehavior.FlyBehavior;
import DuckBehavior.QuackBehaviour;

public abstract class Duck {
    String name;

    FlyBehavior flyBehavior;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }

    public abstract void display();

    public void perforFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}
