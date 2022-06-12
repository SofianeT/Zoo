package models.Employee;

import models.Animal.Animal;
import models.Enclosure.Enclosure;

public class Employee {

    // Properties
    private String name;
    private String sex;
    private byte age;

    public Employee(String name, String sex, byte age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public byte getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    // Methods
    public void examineEnclosure(Enclosure enclosure) {
        enclosure.displayEnclosureAndAnimalsCharacteristics(enclosure);
    }

    public void cleanEnclosure(Enclosure enclosure) {
        enclosure.cleaning(enclosure);
    }

    public void feedingAnimalsOfEnclosure(Enclosure enclosure) {
        enclosure.feedAnimals(enclosure);
    }

    public void transferringAnimalFromEnclosureToAnother(Animal animal, Enclosure enclosure1, Enclosure enclosure2) {
        if(enclosure1.getAnimals().contains(animal)) {
            enclosure1.removeAnimal(animal, enclosure1);
            enclosure2.addAnimal(animal, enclosure2);
            System.out.println("L'animal a été transféré avec succès !");
        } else {
            System.out.println("L'animal est introuvable dans l'enclos !");
        }
    }

}
