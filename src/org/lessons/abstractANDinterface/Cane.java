package org.lessons.abstractANDinterface;

public class Cane extends Animale {

    @Override
    protected void verso() {
        System.out.println("Bau!");
    }

    @Override
    protected void mangia() {
        System.out.println("Il cane mangia le crocchette");
    };
}
