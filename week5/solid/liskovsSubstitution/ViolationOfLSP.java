class Rectangle {
    private int width;
    private int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
        this.side = width;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
        this.side = height;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }
}

public class ViolationOfLSP {
    public static void main(String[] args) {
        Square r = new Square(5);
        //Want to change the height of the rectangle object to 10
        r.setHeight(10);
        System.out.println("Width of r: " + r.getWidth() + " Height of r: " + r.getHeight());
    }
}

