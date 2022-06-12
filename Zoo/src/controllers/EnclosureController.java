package controllers;

import models.Animal.Animal;
import models.Animal.Mammal.*;
import models.Animal.Other.Eagle;
import models.Animal.Other.Goldfish;
import models.Animal.Other.Penguin;
import models.Enclosure.Aquarium;
import models.Enclosure.Aviary;
import models.Enclosure.Enclosure;
import models.Enclosure.StandardEnclosure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnclosureController {

    public static void chooseAnAction(String enclosure) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        // Animals List
        List<Animal> wolfList = new ArrayList<>();
        wolfList.add(new Wolf("Bergamo", "Mâle", 26.44, 1.55, false, false, true, (byte) 69));

        List<Animal> tigerList = new ArrayList<>();
        tigerList.add(new Tiger("Austin", "Mâle", 56.44, 1.85, true, false, true, (byte) 102));

        List<Animal> bearList = new ArrayList<>();
        bearList.add(new Bear("Bouba", "Mâle", 155.53, 2.65, true, false, true, (byte) 225));

        List<Animal> whaleList = new ArrayList<>();
        whaleList.add(new Whale("Doquaire", "Femelle", 27000.49, 11.55, false, false, true, (byte) 365));

        List<Animal> goldfishList = new ArrayList<>();
        goldfishList.add(new Goldfish("Némo", "Mâle", 0.11, 0.48, true, false, true, (byte) 5));

        List<Animal> sharkList = new ArrayList<>();
        sharkList.add(new Shark("Kisame", "Mâle", 140.32, 3.12, true, false, true, (byte) 274));

        List<Animal> eagleList = new ArrayList<>();
        eagleList.add(new Eagle("Guériaigle", "Femelle", 5.34, 0.98, false, false, true, (byte) 45));

        List<Animal> penguinList = new ArrayList<>();
        penguinList.add(new Penguin("Tiplouf", "Mâle", 0.72, 0.43, false, true, true, (byte) 37));

        // Enclosures
        StandardEnclosure enclosLoup = new StandardEnclosure("Enclos de loups", 950, 15, 1, (ArrayList<Animal>) wolfList, (byte) 4, "Loup");
        StandardEnclosure enclosTigre = new StandardEnclosure("Enclos de tigres", 1200, 12, 1, (ArrayList<Animal>) tigerList, (byte) 7, "Tigre");
        StandardEnclosure enclosOurs = new StandardEnclosure("Enclos d'ours", 1280, 7, 1, (ArrayList<Animal>) bearList, (byte) 5, "Ours");
        Aquarium enclosBaleine = new Aquarium("Enclos de baleines", 12000, 5, 1, (ArrayList<Animal>) whaleList, (byte) 10, "Baleine", 500, 3);
        Aquarium enclosPoissonRouge = new Aquarium("Enclos de poissons rouges", 500, 40, 1, (ArrayList<Animal>) goldfishList, (byte) 10, "Poisson rouge", 15, 3);
        Aquarium enclosRequin = new Aquarium("Enclos de requins", 7000, 10, 1, (ArrayList<Animal>) sharkList, (byte) 7, "Requin", 200, 3);
        Aviary enclosAigle = new Aviary("Enclos d'aigles", 5000, 10, 1, (ArrayList<Animal>) eagleList, (byte) 5, "Aigle", 100);
        StandardEnclosure enclosPinguin = new StandardEnclosure("Enclos de pingouins", 800, 40, 1, (ArrayList<Animal>) penguinList, (byte) 9, "Pinguin");

        // Animals to add to the enclosure
        Wolf loup2 = new Wolf("Bergamette", "Femelle", 26.44, 1.55, false, false, true, (byte) 69);
        Tiger tigre2 = new Tiger("Austinette", "Femelle", 56.44, 1.85, true, false, true, (byte) 102);
        Bear ours2 = new Bear("Boubette", "Femelle", 155.53, 2.65, true, false, true, (byte) 225);
        Whale baleine2 = new Whale("Docker", "Mâle", 27000.49, 11.55, false, false, true, (byte) 365);
        Goldfish poisson2 = new Goldfish("Dory", "Femelle", 0.11, 0.48, true, false, true, (byte) 5);
        Shark requin2 = new Shark("Kisamette", "Femelle", 140.32, 3.12, true, false, true, (byte) 274);
        Eagle aigle2 = new Eagle("Vaututrice", "Mâle", 5.34, 0.98, false, false, true, (byte) 45);
        Penguin pingouin2 = new Penguin("Linux", "Mâle", 0.72, 0.43, false, true, true, (byte) 37);


        switch (choice) {
            case 1:
                switch(enclosure) {
                        case "Enclos de loups":
                            enclosLoup.displayEnclosureAndAnimalsCharacteristics(enclosLoup);
                            break;
                        case "Enclos de tigres":
                            enclosTigre.displayEnclosureAndAnimalsCharacteristics(enclosTigre);
                            break;
                        case "Enclos d'ours":
                            enclosOurs.displayEnclosureAndAnimalsCharacteristics(enclosOurs);
                            break;
                        case "Enclos de baleines":
                            enclosBaleine.displayEnclosureAndAnimalsCharacteristics(enclosBaleine);
                            break;
                        case "Enclos de poissons rouges":
                            enclosPoissonRouge.displayEnclosureAndAnimalsCharacteristics(enclosPoissonRouge);
                            break;
                        case "Enclos de requins":
                            enclosRequin.displayEnclosureAndAnimalsCharacteristics(enclosRequin);
                            break;
                        case "Enclos d'aigles":
                            enclosAigle.displayEnclosureAndAnimalsCharacteristics(enclosAigle);
                            break;
                        case "Enclos de pingouins":
                            enclosPinguin.displayEnclosureAndAnimalsCharacteristics(enclosPinguin);
                            break;
                }
                break;
            case 2:
                switch(enclosure) {
                    case "Enclos de loups":
                        enclosLoup.addAnimal(loup2, enclosLoup);
                        break;
                    case "Enclos de tigres":
                        enclosTigre.addAnimal(tigre2, enclosTigre);
                        break;
                    case "Enclos d'ours":
                        enclosOurs.addAnimal(ours2, enclosOurs);
                        break;
                    case "Enclos de baleines":
                        enclosBaleine.addAnimal(baleine2, enclosBaleine);
                        break;
                    case "Enclos de poissons rouges":
                        enclosPoissonRouge.addAnimal(poisson2, enclosPoissonRouge);
                        break;
                    case "Enclos de requins":
                        enclosRequin.addAnimal(requin2, enclosRequin);
                        break;
                    case "Enclos d'aigles":
                        enclosAigle.addAnimal(aigle2, enclosAigle);
                        break;
                    case "Enclos de pingouins":
                        enclosPinguin.addAnimal(pingouin2, enclosPinguin);
                        break;
                }
                break;
            case 3:
                switch(enclosure) {
                    case "Enclos de loups":
                        enclosLoup.removeAnimal(loup2, enclosLoup);
                        break;
                    case "Enclos de tigres":
                        enclosTigre.removeAnimal(tigre2, enclosTigre);
                        break;
                    case "Enclos d'ours":
                        enclosOurs.removeAnimal(ours2, enclosOurs);
                        break;
                    case "Enclos de baleines":
                        enclosBaleine.removeAnimal(baleine2, enclosBaleine);
                        break;
                    case "Enclos de poissons rouges":
                        enclosPoissonRouge.removeAnimal(poisson2, enclosPoissonRouge);
                        break;
                    case "Enclos de requins":
                        enclosRequin.removeAnimal(requin2, enclosRequin);
                        break;
                    case "Enclos d'aigles":
                        enclosAigle.removeAnimal(aigle2, enclosAigle);
                        break;
                    case "Enclos de pingouins":
                        enclosPinguin.removeAnimal(pingouin2, enclosPinguin);
                        break;
                }
                break;
            case 4:
                switch(enclosure) {
                    case "Enclos de loups":
                        enclosLoup.feedAnimals(enclosLoup);
                        break;
                    case "Enclos de tigres":
                        enclosTigre.feedAnimals(enclosTigre);
                        break;
                    case "Enclos d'ours":
                        enclosOurs.feedAnimals(enclosOurs);
                        break;
                    case "Enclos de baleines":
                        enclosBaleine.feedAnimals(enclosBaleine);
                        break;
                    case "Enclos de poissons rouges":
                        enclosPoissonRouge.feedAnimals(enclosPoissonRouge);
                        break;
                    case "Enclos de requins":
                        enclosRequin.feedAnimals(enclosRequin);
                        break;
                    case "Enclos d'aigles":
                        enclosAigle.feedAnimals(enclosAigle);
                        break;
                    case "Enclos de pingouins":
                        enclosPinguin.feedAnimals(enclosPinguin);
                        break;
                }
                break;
            case 5:
                switch(enclosure) {
                    case "Enclos de loups":
                        enclosLoup.cleaning(enclosLoup);
                        break;
                    case "Enclos de tigres":
                        enclosTigre.cleaning(enclosTigre);
                        break;
                    case "Enclos d'ours":
                        enclosOurs.cleaning(enclosOurs);
                        break;
                    case "Enclos de baleines":
                        enclosBaleine.cleaning(enclosBaleine);
                        break;
                    case "Enclos de poissons rouges":
                        enclosPoissonRouge.cleaning(enclosPoissonRouge);
                        break;
                    case "Enclos de requins":
                        enclosRequin.cleaning(enclosRequin);
                        break;
                    case "Enclos d'aigles":
                        enclosAigle.cleaning(enclosAigle);
                        break;
                    case "Enclos de pingouins":
                        enclosPinguin.cleaning(enclosPinguin);
                        break;
                }
                break;
            case 6:
                System.out.println("Voulez-vous quitter le programme ? (O/N)");
                String answer = sc.nextLine();
                if(answer.equals("O") || answer.equals("o")) {
                    System.out.println("Au revoir !");
                    break;
                }
                else {
                    System.out.println("Veuillez choisir une option");
                }
        }
    }
}
