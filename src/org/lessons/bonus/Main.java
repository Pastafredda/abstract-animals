package org.lessons.bonus;

public class Main {
    public static void main(String[] args) {
        Device playstation = Creator.create("Playstation");
        playstation.play();
        playstation.stop();
        Device lettoreDvd = Creator.create("Lettore dvd");
        lettoreDvd.play();
        lettoreDvd.stop();
    }
}
