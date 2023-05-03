package week5.designPatterns.behavioural.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

    Light livingRoomLight = new Light();
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);

    Stereo stereo = new Stereo();
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    remote.setCommand(1, stereoOn, stereoOff);

    remote.onButtonPressed(0); // turn on living room light
    remote.offButtonPressed(0); // turn off living room light
    remote.onButtonPressed(1); // turn on stereo
    remote.undoButtonPressed(); // undo previous command (turn off stereo)
    remote.offButtonPressed(1); // turn off stereo
    }
}
