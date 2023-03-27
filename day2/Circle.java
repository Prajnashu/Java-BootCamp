package day2;

public class Circle {
    // write your code here
    private double radius;
    
    public Circle(double radius) {
        // this.radius = radius<0 ? 0 : radius;
        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getVolume() {
        return super.getArea() * height;
    }
    
}
