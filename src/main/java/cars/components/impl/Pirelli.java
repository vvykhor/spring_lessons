package cars.components.impl;

import cars.components.Wheel;

/**
 * Created by vykhor on 04.07.17.
 */
public class Pirelli implements Wheel {

    public void getInfo() {
        System.out.println("Wheel: Pirelli");
    }

    public void initObject() {
        System.out.println("init wheels pirelli");
    }
}
