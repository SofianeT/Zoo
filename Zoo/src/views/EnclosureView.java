package views;

import controllers.EnclosureController;

import java.util.Scanner;

public class EnclosureView {

    String enclosure = "";

    public void chooseAnEnclosure() {
        System.out.println("Voici la liste des enclos 🏞" + "\n");
        System.out.println("1 - Enclos de loups 🐺");
        System.out.println("2 - Enclos de tigres 🐯");
        System.out.println("3 - Enclos d'ours 🐻");
        System.out.println("4 - Enclos de baleines 🐳");
        System.out.println("5 - Enclos de poissons rouges 🐡");
        System.out.println("6 - Enclos de requins 🦈");
        System.out.println("7 - Enclos d'aigles 🦅");
        System.out.println("8 - Enclos de pingouins 🐧");

        Scanner sc = new Scanner(System.in);

        System.out.println("👉 Choisissez l'enclos dont vous souhaitez vous occuper :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Vous avez choisi l'enclos de loups 🐺");
                this.enclosure = "Enclos de loups";
                actionsWithEnclosure(enclosure);
                break;
            case 2:
                System.out.println("Vous avez choisi l'enclos de tigres 🐯");
                this.enclosure = "Enclos de tigres";
                actionsWithEnclosure(enclosure);
                break;
            case 3:
                System.out.println("Vous avez choisi l'enclos d'ours 🐻");
                this.enclosure = "Enclos d'ours";
                actionsWithEnclosure(enclosure);
                break;
            case 4:
                System.out.println("Vous avez choisi l'enclos de baleines 🐳");
                this.enclosure = "Enclos de baleines";
                actionsWithEnclosure(enclosure);
                break;
            case 5:
                System.out.println("Vous avez choisi l'enclos de poissons rouges 🐡");
                this.enclosure = "Enclos de poissons rouges";
                actionsWithEnclosure(enclosure);
                break;
            case 6:
                System.out.println("Vous avez choisi l'enclos de requins 🦈");
                this.enclosure = "Enclos de requins";
                actionsWithEnclosure(enclosure);
                break;
            case 7:
                System.out.println("Vous avez choisi l'enclos d'aigles 🦅");
                this.enclosure = "Enclos d'aigles";
                actionsWithEnclosure(enclosure);
                break;
            case 8:
                System.out.println("Vous avez choisi l'enclos de pingouins 🐧");
                this.enclosure = "Enclos de pingouins";
                actionsWithEnclosure(enclosure);
                break;
            default:
                System.out.println("Veuillez choisir une option valide");
                break;
        }
    }

    public void actionsWithEnclosure(String enclosure) {
        System.out.println("Vous pouvez :");
        System.out.println("1 - Voir les animaux de l'enclos et afficher ses caractéristiques ✨");
        System.out.println("2 - Ajouter un animal ➕");
        System.out.println("3 - Supprimer un animal ❌");
        System.out.println("4 - Nourrir les animaux 🍖");
        System.out.println("5 - Entretenir l'enclos 🏠");
        System.out.println("6 - Quitter");

        EnclosureController.chooseAnAction(enclosure);
    }
}
