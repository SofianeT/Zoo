package models.Animal.Mammal;

import models.Animal.Animal;

public abstract class Mammal extends Animal {

    // attributes
    private byte durationGestation;

    // constructor
    public Mammal(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator, byte durationGestation) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthIndicator);
        this.durationGestation = durationGestation;
    }

    // getters
    public byte getDurationGestation() {
        return durationGestation;
    }

    // setters
    public void setDurationGestation(byte durationGestation) {
        this.durationGestation = durationGestation;
    }

    // methods
    public void giveBirth() {
        if(super.getSex().equals("Female")) {
            System.out.println(super.getName() + " vient de mettre bas ! 🤰");
        }
    }
}
