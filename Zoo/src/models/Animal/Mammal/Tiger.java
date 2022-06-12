package models.Animal.Mammal;

import models.Interface.WanderingAnimal;

public class Tiger extends Mammal implements WanderingAnimal {

    // Constructor
    public Tiger(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator, byte durationGestation) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthIndicator, durationGestation);
    }

    @Override
    public boolean wander() {
        System.out.println("Les tigres vagabondent ! 🐅");
        return true;
    }
}
