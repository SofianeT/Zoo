package models.Animal.Mammal;

import models.Interface.WanderingAnimal;

public class Wolf extends Mammal implements WanderingAnimal {

    // Constructor
    public Wolf(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator, byte durationGestation) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthIndicator, durationGestation);
    }

    @Override
    public boolean wander() {
        System.out.println("Les loups vagabondent ! 🐺");
        return true;
    }
}
