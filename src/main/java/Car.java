import components.Engine;
import components.Wheel;

/**
 * Created by vykhor on 04.07.17.
 */
public class Car {

    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void getInfo() {
        wheel.getInfo();
        engine.getInfo();
    }

}
