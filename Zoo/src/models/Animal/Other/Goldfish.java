package models.Animal.Other;

import models.Interface.MarineAnimal;

public class Goldfish extends Other implements MarineAnimal {

    // Constructor
    public Goldfish(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthyIndicator, byte incubationTime) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthyIndicator, incubationTime);
    }

    @Override
    public boolean swim() {
        System.out.println("Les poissons rouges sont en train de nager ! 🐡");
        return true;
    }
}
