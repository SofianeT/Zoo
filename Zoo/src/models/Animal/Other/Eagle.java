package models.Animal.Other;

import models.Interface.FlyingAnimal;

public class Eagle extends Other implements FlyingAnimal {

    // Constructor
    public Eagle(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthyIndicator, byte incubationTime) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthyIndicator, incubationTime);
    }

    @Override
    public boolean fly() {
        System.out.println("Les aigles sont en train de voler 🦅");
        return true;
    }
}
