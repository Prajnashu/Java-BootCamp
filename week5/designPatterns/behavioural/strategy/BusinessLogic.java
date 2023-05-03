package week5.designPatterns.behavioural.strategy;

public class BusinessLogic {
    private Strategy strategy;

    public BusinessLogic(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.doOperation();
    }
}
