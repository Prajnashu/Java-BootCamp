package week5.designPatterns.structural.adapter;

//Unrelated to Volt, provides the 120 volt coming in the socket.
public class WallSocket {
    public Volt getVolt(){
		return new Volt(120);
	}
}
