public class MultilevelInheritance {
    public static void main(String[] args) {

        Dog dog = new Dog("Golden Retriever");

        // dog can access the getKingdom method in LivingOrganism class because it extends it.
        System.out.println(dog.getKingdom());
        
    }
}

class LivingOrganisms {
    private String kingdom = "Animals";

    public String getKingdom() {
        return this.kingdom;
    }
}

class Animals extends LivingOrganisms {
    private String family;

    public String getFamily() {
        return this.family;
    }
}

class Carnivores extends Animals {
    private String genus;
    
    public String getGenus() {
        return this.genus;
    }
}

class Dog extends Carnivores {
    private String species;

    public Dog(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }
}
