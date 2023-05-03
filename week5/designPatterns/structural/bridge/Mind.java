package week5.designPatterns.structural.bridge;

public interface Mind {
    public Integer happiness();
}

class Chill implements Mind {
    public Integer happiness() {
        return 100;
    }
}

class Serious implements Mind {
    public Integer happiness() {
        return 80;
    }
}