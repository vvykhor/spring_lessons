import components.Engine;
import components.Wheel;

/**
 * Created by vykhor on 04.07.17.
 */
public class Car {

    private String color;
    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public Car(Wheel wheel, Engine engine, String color) {
        this.wheel = wheel;
        this.engine = engine;
        this.color = color;
    }

    public void getInfo() {
        wheel.getInfo();
        engine.getInfo();
        if(color != null) {
            System.out.println("Color: " + color);
        }
    }

}
