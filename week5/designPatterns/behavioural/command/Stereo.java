package week5.designPatterns.behavioural.command;

// Stereo.java
public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("CD inserted");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}