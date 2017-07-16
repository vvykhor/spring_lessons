package cars.components.impl;

import cars.components.Engine;

/**
 * Created by vykhor on 04.07.17.
 */
public class EngineV12 implements Engine {

    public void getInfo() {
        System.out.println("Engine: V12");
    }

    public void initObject() {
        System.out.println("init engine v12");
    }

}
