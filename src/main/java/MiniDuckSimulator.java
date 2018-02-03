import DuckBehavior.FlyRocketPowered;
import DuckSubtypes.Duck;
import DuckSubtypes.MallardDuck;
import DuckSubtypes.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();

        mallard.perforFly();
        mallard.performQuack();

        Duck model = new ModelDuck();

        model.perforFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perforFly();
        model.swim();
    }
}
