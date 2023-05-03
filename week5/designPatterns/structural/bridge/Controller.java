package week5.designPatterns.structural.bridge;

public class Controller {
    public static void main(String[] args) {
        Person male = new Male(new Chill());
        male.checkHappiness();

        Person female = new Female(new Serious());
        female.checkHappiness();
    }
}
