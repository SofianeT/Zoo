package models.Enclosure;

import models.Animal.Animal;

import java.util.ArrayList;

public class Aquarium extends Enclosure {

    // Attributes
    private int poolDepth; // (profondeur du bassin)
    private int waterSalinity; // (1 = bad, 2 = medium, 3 = clean)

    // Constructor
    public Aquarium(String name, int area, int maxNbAnimals, int nbAnimalsPresent, ArrayList<Animal> animals, byte cleanlinessDegree, String typeAnimal, int poolDepth, int waterSalinity) {
        super(name, area, maxNbAnimals, nbAnimalsPresent, animals, cleanlinessDegree, typeAnimal);
        this.poolDepth = poolDepth;
        this.waterSalinity = waterSalinity;
    }

    // Getters
    public int getPoolDepth() {
        return poolDepth;
    }

    public int getWaterSalinity() {
        return waterSalinity;
    }

    // Setters
    public void setPoolDepth(int poolDepth) {
        this.poolDepth = poolDepth;
    }

    public void setWaterSalinity(int waterSalinity) {
        this.waterSalinity = waterSalinity;
    }

    // Methods
    public void verifAquariumCharacteristics() {
        if(this.poolDepth > 0 && this.waterSalinity > 2) {
            System.out.println("L'aquarium est bien configuré");
        }
        else {
            System.out.println("La salinité ou la profondeur du bassin sont incorrects, l'aquarium va être configuré automatiquement");
            this.poolDepth = 10;
            this.waterSalinity = 3;
            System.out.println("La profondeur du bassin est maintenant de " + this.poolDepth + " cm");
            System.out.println("La salinité est maintenant de " + this.waterSalinity);
        }
    }

}
