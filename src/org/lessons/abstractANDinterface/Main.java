package org.lessons.abstractANDinterface;

import org.lessons.abstractANDinterface.interfaces.IVolante;
import org.lessons.abstractANDinterface.interfaces.INuotante;

public class Main {

    public void faiVolare(IVolante animale) {
        animale.vola();
    }

    public void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {

        Main main = new Main();

        Aquila aquila = new Aquila();
        main.faiVolare(aquila);
    }
}
