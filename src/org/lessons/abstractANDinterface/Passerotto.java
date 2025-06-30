package org.lessons.abstractANDinterface;
import org.lessons.abstractANDinterface.interfaces.IVolante;

public class Passerotto extends AbstractAnimale implements IVolante{

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

    @Override
    protected void verso() {
        System.out.println("Cip cip!");
    }

    @Override
    protected void mangia() {
        System.out.println("Il passerotto mangia semi e insetti");
    };

}
