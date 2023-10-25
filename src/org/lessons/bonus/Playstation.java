package org.lessons.bonus;

public class Playstation extends Creator implements Device{
    @Override
    public void play() {
        System.out.println("Playstation è in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Playstation è in modalità stop");
    }
}
