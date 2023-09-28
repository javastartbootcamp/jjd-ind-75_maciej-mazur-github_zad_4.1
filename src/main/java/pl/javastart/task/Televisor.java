package pl.javastart.task;

public class Televisor {
    private boolean turnedOn = false;

    void turnOn() {
        turnedOn = true;
    }

    void turnOff() {
        turnedOn = false;
    }

    void showStatus() {
        System.out.println("Telewizor jest " + (turnedOn ? "włączony." : "wyłączony."));
    }
}
