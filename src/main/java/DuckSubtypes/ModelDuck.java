package DuckSubtypes;

import DuckBehavior.FlyNoWay;
import DuckBehavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehaviour = new Quack();
    }


    @Override
    public void display() {
        System.out.println("I'am a model duck.");
    }

}
