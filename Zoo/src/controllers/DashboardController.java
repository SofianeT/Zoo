package controllers;

import models.Animal.Animal;
import views.AnimalView;
import views.EmployeeView;
import views.EnclosureView;

import java.util.Scanner;

public class DashboardController {

    public void chooseOnTheMenu(){

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Vous avez choisi la gestion des animaux 🦁");
                AnimalView animalView = new AnimalView();
                animalView.chooseAnAnimal();
                break;
            case 2:
                System.out.println("Vous avez choisi la gestion des enclos 🏞");
                EnclosureView enclosureView = new EnclosureView();
                enclosureView.chooseAnEnclosure();
                break;
            case 3:
                System.out.println("Vous avez choisi la gestion des zoos 🦒");
                break;
            case 4:
                System.out.println("Vous avez choisi la gestion des employés 🧑‍");
                EmployeeView employeeView = new EmployeeView();
                employeeView.menuEmployee();
                break;
            case 5:
                System.out.println("Vous avez choisi de quitter 👋");
                break;
            default:
                System.out.println("Veuillez choisir une option valide");
                break;
        }
    }
}
