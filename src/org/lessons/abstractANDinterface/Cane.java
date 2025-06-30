package org.lessons.abstractANDinterface;
import org.lessons.abstractANDinterface.interfaces.INuotante;

public class Cane extends AbstractAnimale implements INuotante {

    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

    @Override
    protected void verso() {
        System.out.println("Bau!");
    }

    @Override
    protected void mangia() {
        System.out.println("Il cane mangia le crocchette");
    };
}
