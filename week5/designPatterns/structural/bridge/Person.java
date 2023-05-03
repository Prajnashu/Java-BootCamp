package week5.designPatterns.structural.bridge;

public abstract class Person {
    //composition used
    protected Mind mind;

    public Person(Mind mind) {
        this.mind = mind;
    }

    abstract public void checkHappiness();
    
}

class Male extends Person {
    public Male(Mind mind) {
        super(mind);
    }

    @Override
    public void checkHappiness() {
        System.out.println("Operating at " + mind.happiness() + " Happiness.");
    }
}

class Female extends Person {
    
    public Female(Mind mind) {
        super(mind);
    }

    @Override
    public void checkHappiness() {
        System.out.println("Operating at " + mind.happiness() + " Happiness.");
    }
}