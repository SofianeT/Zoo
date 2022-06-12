package models.Animal.Other;

import models.Animal.Animal;

public abstract class Other extends Animal {

    // attributes
    private byte incubationTime;

    // constructor
    public Other(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator, byte incubationTime) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthIndicator);
        this.incubationTime = incubationTime;
    }

    // getters
    public byte getIncubationTime() {
        return incubationTime;
    }

    // setters
    public void setIncubationTime(byte incubationTime) {
        this.incubationTime = incubationTime;
    }

    // methods
    // Voir s'il faut faire un getIncubationTime et vérifier que la durée d'incubation a bien été atteinte
    public void layEggs() {
        if(super.getSex().equals("Female")) {
            System.out.println(super.getName() + " vient de pondre un oeuf ! 🥚");
        }
    }
}
