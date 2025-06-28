package org.lessons.abstractANDinterface;

public class Delfino extends Animale {

    @Override
    protected void verso() {
        System.out.println("Click-click!");
    }

    @Override
    protected void mangia() {
        System.out.println("Il delfino mangia pesce");
    };

}
