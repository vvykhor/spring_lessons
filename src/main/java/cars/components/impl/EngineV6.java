package cars.components.impl;

import cars.components.Engine;

/**
 * Created by vykhor on 04.07.17.
 */
public class EngineV6 implements Engine {

    public void getInfo() {
        System.out.println("Engine: V6");
    }

    public void initObject() {
        System.out.println("init engine v6");
    }

}
