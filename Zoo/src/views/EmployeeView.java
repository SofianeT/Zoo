package views;

import java.util.Scanner;

public class EmployeeView {

    String employee = "";

    public void menuEmployee() {
        System.out.println("Choisir une option :");
        System.out.println("1. Examiner un enclos 🏞");
        System.out.println("2. Nettoyer un enclos ✨");
        System.out.println("3. Nourrir les animaux d'un enclos 🍖");
        System.out.println("4. Transférer un animal d'un enclos à un autre 🐻");
        System.out.println("5. Quitter");

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez choisir une option :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Quel enclos souhaitez-vous examiner ?");
                break;
            case 2:
                System.out.println("Quel enclos souhaitez-vous nettoyer ?");
                break;
            case 3:
                System.out.println("Quel enclos souhaitez-vous nourrir ?");
                break;
            case 4:
                System.out.println("Quel enclos souhaitez-vous transférer ?");
                break;
        }
    }
}
