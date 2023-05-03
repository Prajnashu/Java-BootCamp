package week5.designPatterns.behavioural.strategy;

public interface Strategy {
    public void doOperation();
}

class ConcreteStrategy1 implements Strategy {
    public void doOperation() {
        System.out.println("Executing strategy 1");
    }
}

class ConcreteStrategy2 implements Strategy {
    public void doOperation() {
        System.out.println("Executing strategy 2");
    }
}

