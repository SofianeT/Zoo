package controllers;

import models.Animal.Animal;
import models.Animal.Mammal.*;
import models.Animal.Other.Goldfish;
import models.Animal.Other.Eagle;
import models.Animal.Other.Penguin;

import views.AnimalView;

import java.util.Scanner;

public class AnimalController {

    public static void chooseTheActions(String animals) {

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        Wolf loup = new Wolf("Bergamo", "Mâle", 26.44, 1.55, false, false, true, (byte) 69);
        Tiger tigre = new Tiger("Austin", "Mâle", 56.44, 1.85, true, false, true, (byte) 102);
        Bear ours = new Bear("Bouba", "Mâle", 155.53, 2.65, true, false, true, (byte) 225);
        Whale baleine = new Whale("Doquaire", "Femelle", 27000.49, 11.55, false, false, true, (byte) 365);
        Goldfish poisson = new Goldfish("Némo", "Mâle", 0.11, 0.48, true, false, true, (byte) 5);
        Shark requin = new Shark("Kisame", "Mâle", 140.32, 3.12, true, false, true, (byte) 274);
        Eagle aigle = new Eagle("Guériaigle", "Femelle", 5.34, 0.98, false, false, true, (byte) 45);
        Penguin pingouin = new Penguin("Tiplouf", "Mâle", 0.72, 0.43, false, true, true, (byte) 37);

        switch (choice) {
            case "1":
                System.out.println("Les " + animals + " vont être nourris ! 🍲");
                switch(animals) {
                    case "loups":
                        loup.eat();
                        break;
                    case "tigres":
                        tigre.eat();
                        break;
                    case "ours":
                        ours.eat();
                        break;
                    case "baleines":
                        baleine.eat();
                        break;
                    case "poissons rouges":
                        poisson.eat();
                        break;
                    case "requins":
                        requin.eat();
                        break;
                    case "aigles":
                        aigle.eat();
                        break;
                    case "pingouins":
                        pingouin.eat();
                        break;
                }
                break;
            case "2":
                System.out.println("Les " + animals + " vont être soignés ! 💊");
                switch(animals) {
                    case "loups":
                        loup.beCared();
                        break;
                    case "tigres":
                        tigre.beCared();
                        break;
                    case "ours":
                        ours.beCared();
                        break;
                    case "baleines":
                        baleine.beCared();
                        break;
                    case "poissons rouges":
                        poisson.beCared();
                        break;
                    case "requins":
                        requin.beCared();
                        break;
                    case "aigles":
                        aigle.beCared();
                        break;
                    case "pingouins":
                        pingouin.beCared();
                        break;
                }
                break;
            case "3":
                System.out.println("Les " + animals +  " vont émettre un son ! 🔊");
                switch(animals) {
                    case "loups":
                        loup.makeSound();
                        break;
                    case "tigres":
                        tigre.makeSound();
                        break;
                    case "ours":
                        ours.makeSound();
                        break;
                    case "baleines":
                        baleine.makeSound();
                        break;
                    case "poissons rouges":
                        poisson.makeSound();
                        break;
                    case "requins":
                        requin.makeSound();
                        break;
                    case "aigles":
                        aigle.makeSound();
                        break;
                    case "pingouins":
                        pingouin.makeSound();
                        break;
                }
                break;
            case "4":
                System.out.println("Les " + animals + " vont dormir ! 💤");
                switch(animals) {
                    case "loups":
                        loup.sleep();
                        break;
                    case "tigres":
                        tigre.sleep();
                        break;
                    case "ours":
                        ours.sleep();
                        break;
                    case "baleines":
                        baleine.sleep();
                        break;
                    case "poissons rouges":
                        poisson.sleep();
                        break;
                    case "requins":
                        requin.sleep();
                        break;
                    case "aigles":
                        aigle.sleep();
                        break;
                    case "pingouins":
                        pingouin.sleep();
                        break;
                }
                break;
            case "5.A":
                System.out.println("Les " + animals + " vont vagadonder ! 🏃");
                switch(animals) {
                    case "loups":
                        loup.wander();
                        break;
                    case "tigres":
                        tigre.wander();
                        break;
                    case "ours":
                        ours.wander();
                        break;
                    case "pingouins":
                        pingouin.wander();
                }
                break;
            case "5.B":
                System.out.println("Les " + animals + " vont nager ! 🐟");
                switch(animals) {
                    case "baleines":
                        baleine.swim();
                        break;
                    case "poissons rouges":
                        poisson.swim();
                        break;
                    case "requins":
                        requin.swim();
                        break;
                    case "ours":
                        ours.swim();
                        break;
                    case "pingouins":
                        pingouin.swim();
                        break;
                }
                break;
            case "5.C":
                System.out.println("Les " + animals + " vont voler ! 🐦");
                switch(animals) {
                    case "aigles":
                        aigle.fly();
                        break;
                    case "pingouins":
                        pingouin.fly();
                        break;
                }
                break;
            case "6":
                if(animals == "loups" || animals == "tigres" || animals == "ours" || animals == "requins" || animals == "baleines") {
                    System.out.println("Les " + animals + " femelles vont mettre bas ! 🐾");
                }
                else {
                    System.out.println("Les " + animals + " femelles vont pondre des oeufs ! 🥚");
                }
                break;
            case "7":
                System.out.println("Vous avez choisi de quitter 👋");
                break;
            default:
                System.out.println("Veuillez choisir une option valide");
                break;
        }
    }
}
