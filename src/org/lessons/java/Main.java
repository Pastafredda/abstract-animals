package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino= new Delfino();

        Animale[] animals = {cane,passerotto,aquila,delfino};

        for (int i = 0; i < animals.length ; i++) {
            animals[i].verso();
            animals[i].mangia();
            animals[i].dormi();
        }
    }
}
