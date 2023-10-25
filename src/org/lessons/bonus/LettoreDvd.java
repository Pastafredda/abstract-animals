package org.lessons.bonus;

public class LettoreDvd extends Creator implements Device{
    @Override
    public void play() {
        System.out.println("lettore Dvd è in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("lettore Dvd è in modalità stop");
    }
}
