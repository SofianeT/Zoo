package models.Enclosure;

import models.Animal.Animal;

import java.util.ArrayList;

public class StandardEnclosure extends Enclosure {

    // Constructor
    public StandardEnclosure(String name, int area, int maxNbAnimals, int nbAnimalsPresent, ArrayList<Animal> animals, byte cleanlinessDegree, String typeAnimal) {
        super(name, area, maxNbAnimals, nbAnimalsPresent, animals, cleanlinessDegree, typeAnimal);
    }
}