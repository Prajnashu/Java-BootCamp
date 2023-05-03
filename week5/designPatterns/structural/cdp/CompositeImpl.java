package week5.designPatterns.structural.cdp;

public class CompositeImpl {
    public static void main(String[] args) {
        Square sq = new Square();
        Circle circle = new Circle();

        sq.draw("green");
        circle.draw("orange");

        Drawing comp = new Drawing();
        comp.add(sq);
        comp.add(circle);
        comp.add(new Square());

        comp.draw("red");
    }
}

