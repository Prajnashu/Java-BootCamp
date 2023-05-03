package week5.designPatterns.structural.cdp;

import java.util.ArrayList;
import java.util.List;

//Base class
public interface ShapeInterface {
    public void draw(String color);
}

//leaf class
class Square implements ShapeInterface {
    @Override
    public void draw(String fillColor) {
		System.out.println("Drawing Square with color "+fillColor);
	}
}

//leaf class
class Circle implements ShapeInterface {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color "+fillColor);
	}

}


//composite class containing leaf classes
class Drawing implements ShapeInterface{

	//collection of Shapes
	private List<ShapeInterface> shapes = new ArrayList<ShapeInterface>();
	
	@Override
	public void draw(String fillColor) {
		for(ShapeInterface sh : shapes)
		{
			sh.draw(fillColor);
		}
	}
	
	//adding shape to drawing
	public void add(ShapeInterface s){
		this.shapes.add(s);
	}
	
	//removing shape from drawing
	public void remove(ShapeInterface s){
		shapes.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}