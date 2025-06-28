package org.lessons.abstractANDinterface;

public class Aquila extends Animale {

    @Override
    protected void verso() {
        System.out.println("Screech!");
    }

    @Override
    protected void mangia() {
        System.out.println("L'aquila mangia piccoli animali");
    };
}
