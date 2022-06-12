package models.Enclosure;

import models.Animal.Animal;

import java.util.ArrayList;

public class Aviary extends Enclosure {

    // Attributes
    private int height;

    // Constructor
    public Aviary(String name, int area, int maxNbAnimals, int nbAnimalsPresent, ArrayList<Animal> animals, byte cleanlinessDegree, String typeAnimal, int height) {
        super(name, area, maxNbAnimals, nbAnimalsPresent, animals, cleanlinessDegree, typeAnimal);
        this.height = height;
    }

    // Getters
    public int getHeight() {
        return height;
    }

    // Setters
    public void setHeight(int height) {
        this.height = height;
    }

    // Methods
    public void roofCageVerification(Enclosure enclosure) {
        cleaning(enclosure);
        if (getHeight() == this.height) {
            System.out.println("La volière a bien été entretenu !");
        }
    }
}
