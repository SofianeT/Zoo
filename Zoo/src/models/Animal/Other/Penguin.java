package models.Animal.Other;

import models.Interface.FlyingAnimal;
import models.Interface.MarineAnimal;
import models.Interface.WanderingAnimal;

public class Penguin extends Other implements FlyingAnimal, MarineAnimal, WanderingAnimal {

    // Constructor
    public Penguin(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthyIndicator, byte incubationTime) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthyIndicator, incubationTime);
    }

    @Override
    public boolean fly() {
        System.out.println("Les pingouins sont en train de voler ! 🐧");
        return true;
    }

    @Override
    public boolean swim() {
        System.out.println("Les pingouins sont en train de nager ! 🐧");
        return true;
    }

    @Override
    public boolean wander() {
        System.out.println("Les pingouins sont en train de se déplacer ! 🐧");
        return true;
    }
}
