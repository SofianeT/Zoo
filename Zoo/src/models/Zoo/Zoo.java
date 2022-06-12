package models.Zoo;

import models.Employee.Employee;
import models.Enclosure.Enclosure;

public class Zoo {

    // Attributes
    private String name;
    private Employee[] employees;
    private int nbMaxEnclosures;
    private Enclosure[] existingEnclosures;

    // Constructors
    public Zoo(String name, Employee[] employees, int nbMaxEnclosures, Enclosure[] existingEnclosures) {
        this.name = name;
        this.employees = employees;
        this.nbMaxEnclosures = nbMaxEnclosures;
        this.existingEnclosures = existingEnclosures;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getNbMaxEnclosures() {
        return nbMaxEnclosures;
    }

    public Enclosure[] getExistingEnclosures() {
        return existingEnclosures;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setNbMaxEnclosures(int nbMaxEnclosures) {
        this.nbMaxEnclosures = nbMaxEnclosures;
    }

    public void setExistingEnclosures(Enclosure[] existingEnclosures) {
        this.existingEnclosures = existingEnclosures;
    }

    // Methods
    public void showNbAnimalsPresent() {
        for (Enclosure enclosure : existingEnclosures) {
            System.out.println(enclosure.getName() + ": " + enclosure.getNbAnimalsPresent());
        }
    }

    public void showAnimalsInAllEnclosures() {
        for (Enclosure enclosure : existingEnclosures) {
            System.out.println(enclosure.getName() + ": ");
            enclosure.getAnimals().forEach(animal -> System.out.println(animal.getName()));
        }
    }
}
