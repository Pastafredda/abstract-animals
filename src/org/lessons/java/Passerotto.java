package org.lessons.java;

public class Passerotto extends Animale implements CanFly{
    @Override
    public void verso() {
        System.out.println("Il passerotto fa Chip");
    }

    @Override
    public void mangia() {
        System.out.println("e mangia semi e frutta");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}
