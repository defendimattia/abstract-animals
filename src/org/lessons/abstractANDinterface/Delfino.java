package org.lessons.abstractANDinterface;
import org.lessons.abstractANDinterface.interfaces.INuotante;

public class Delfino extends AbstractAnimale implements INuotante {

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

    @Override
    protected void verso() {
        System.out.println("Click-click!");
    }

    @Override
    protected void mangia() {
        System.out.println("Il delfino mangia pesce");
    };

}
