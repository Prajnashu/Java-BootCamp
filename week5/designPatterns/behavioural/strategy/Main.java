package week5.designPatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        BusinessLogic bl;

        bl = new BusinessLogic(new ConcreteStrategy1());
        bl.executeStrategy();

        bl = new BusinessLogic(new ConcreteStrategy2());
        bl.executeStrategy();
    }
}
