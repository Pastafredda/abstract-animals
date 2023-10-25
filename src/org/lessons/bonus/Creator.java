package org.lessons.bonus;

public abstract class Creator {
    public static Device create(String type) {
        switch (type.toLowerCase()) {
            case "playstation":
                return new Playstation();
            case "lettore dvd":
                return new LettoreDvd();
            default:
                throw new IllegalArgumentException("Dispositivo non riconosciuto");
        }
    }
}
