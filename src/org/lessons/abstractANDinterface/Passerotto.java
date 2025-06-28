package org.lessons.abstractANDinterface;

public class Passerotto extends Animale {

    @Override
    protected void verso() {
        System.out.println("Cip cip!");
    }

    @Override
    protected void mangia() {
        System.out.println("Il passerotto mangia semi e insetti");
    };

}
