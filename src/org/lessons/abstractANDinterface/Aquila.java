package org.lessons.abstractANDinterface;
import org.lessons.abstractANDinterface.interfaces.IVolante;

public class Aquila extends AbstractAnimale implements IVolante {

    
    public void vola(){
        System.out.println("Sto volando!!!");
    }

    @Override
    protected void verso() {
        System.out.println("Screech!");
    }

    @Override
    protected void mangia() {
        System.out.println("L'aquila mangia piccoli animali");
    };
}
