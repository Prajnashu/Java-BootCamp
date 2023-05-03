//This implementation follows OCP as we have an abstract class and all the implementations are extending this abstract class. This way, when new shape is added to the system, it will simply extend the Shape class without modifying any existing code.
abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

class NewShape extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a new shape...");
    }
}

public class ShapeFollowingOCP {
    public static void main(String[] args) {
        
    }
}

