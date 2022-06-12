package views;

import controllers.AnimalController;
import models.Animal.Mammal.Mammal;

import java.util.Scanner;

public class AnimalView {

    String animals = "";

    public void chooseAnAnimal() {
        System.out.println("Voici la liste des animaux :");
        System.out.println("1 - Loups 🐺");
        System.out.println("2 - Tigres 🐯");
        System.out.println("3 - Ours 🐻");
        System.out.println("4 - Baleines 🐳");
        System.out.println("5 - Poissons rouges 🐡");
        System.out.println("6 - Requins 🦈");
        System.out.println("7 - Aigles 🦅");
        System.out.println("8 - Pingouins 🐧");

        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez les animaux dont vous souhaitez vous occuper :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Vous avez choisi les loups 🐺");
                this.animals = "loups";
                actionsWithAnimals(animals);
                break;
            case 2:
                System.out.println("Vous avez choisi les tigres 🐯");
                this.animals = "tigres";
                actionsWithAnimals(animals);
                break;
            case 3:
                System.out.println("Vous avez choisi les ours 🐻");
                this.animals = "ours";
                actionsWithAnimals(animals);
                break;
            case 4:
                System.out.println("Vous avez choisi les baleines 🐳");
                this.animals = "baleines";
                actionsWithAnimals(animals);
                break;
            case 5:
                System.out.println("Vous avez choisi les poissons rouges 🐡");
                this.animals = "poissons rouges";
                actionsWithAnimals(animals);
                break;
            case 6:
                System.out.println("Vous avez choisi les requins 🦈");
                this.animals = "requins";
                actionsWithAnimals(animals);
                break;
            case 7:
                System.out.println("Vous avez choisi les aigles 🦅");
                this.animals = "aigles";
                actionsWithAnimals(animals);
                break;
            case 8:
                System.out.println("Vous avez choisi les pingouins 🐧");
                this.animals = "pingouins";
                actionsWithAnimals(animals);
                break;
            default:
                System.out.println("Vous avez choisi des animaux qui n'existent pas !");
                break;
        }
    }

    public void actionsWithAnimals(String animals) {
        System.out.println("Que voulez-vous faire avec les " + animals + " ?");
        System.out.println("1 - Les nourrir 🍽");
        System.out.println("2 - Les soigner 💊");
        System.out.println("3 - Les faire émettre un cri 🔊");
        System.out.println("4 - Les faire dormir 💤");
        if (animals.equals("loups") || animals.equals("tigres") || animals.equals("ours") || animals.equals("pingouins")) {
            System.out.println("5.A - Les faire vagabonder 🏃");
        }
        if (animals.equals("ours") || animals.equals("baleines") || animals.equals("poissons rouges") || animals.equals("requins") || animals.equals("pingouins")) {
            System.out.println("5.B - Les faire nager 🐟");
        }
        if (animals.equals("aigles") || animals.equals("pingouins")) {
            System.out.println("5.C - Les faire voler 🐦");
        }
        System.out.println("6 - Les faire reproduire 🍼");
        System.out.println("7 - Quitter");

        AnimalController.chooseTheActions(animals);
    }

}
