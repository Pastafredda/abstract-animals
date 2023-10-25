package org.lessons.java;

public class Aquila extends Animale implements CanFly{

    @Override
    public void verso() {
        System.out.println("L'aquila fa cra");
    }

    @Override
    public void mangia() {
        System.out.println("E mangia conigli");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}
