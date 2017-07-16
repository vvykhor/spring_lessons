package cars.models;

import cars.Car;
import cars.components.Engine;
import cars.components.Wheel;

/**
 * Created by vykhor on 04.07.17.
 */
public class Volvo implements Car {

    private String color;
    private Wheel wheel;
    private Engine engine;

    public Volvo(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public Volvo(String color) {
        this.color = color;
    }

    public void getInfo() {
        System.out.println(this);
        wheel.getInfo();
        engine.getInfo();
        if(color != null) {
            System.out.println("Color: " + color);
        }
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void initObject() {
        System.out.println("init");
    }

    public void destroyObject() {
        System.out.println("destroy");
    }
}
