//The class is violating OCP bcz it is not closed for modification and when new functionality will be added to the system, the existing code(Draw method) needs to be modified. This might create new bugs.

public class ShapeViolatingOCP {
    private String type;

    public ShapeViolatingOCP(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void draw() {
        if (type.equals("Circle")) {
            System.out.println("Drawing a circle...");
        } else if (type.equals("Rectangle")) {
            System.out.println("Drawing a rectangle...");
        } else if (type.equals("Triangle")) {
            System.out.println("Drawing a triangle...");
        } else {
            throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}

