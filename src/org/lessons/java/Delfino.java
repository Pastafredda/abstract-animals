package org.lessons.java;

public class Delfino extends Animale implements CanSwim{
    @Override
    public void verso() {
        System.out.println("Il delfino fa gri");
    }

    @Override
    public void mangia() {
        System.out.println("e mangia pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando");
    }
}
