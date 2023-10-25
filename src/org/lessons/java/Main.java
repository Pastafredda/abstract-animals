package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino= new Delfino();

        delfino.verso();
        delfino.mangia();
        faiNuotare(delfino);
        cane.verso();
        cane.mangia();
        aquila.mangia();
        aquila.verso();
        faiVolare(aquila);
        passerotto.verso();
        passerotto.mangia();
        faiVolare(passerotto);
    }
        public static void faiVolare(CanFly vola){
            vola.vola();
        };
        public static void faiNuotare(CanSwim nuota){
            nuota.nuota();
        }
}
