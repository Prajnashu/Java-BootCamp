package week5.designPatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory circleFactory = new CircleFactory();

        //The instantiation of class is done by factory class. This helps to create a clean client code.
        Shape rectangle = rectangleFactory.createShape();
        Shape circle = circleFactory.createShape();

        rectangle.draw();
        circle.draw();
    }
}
