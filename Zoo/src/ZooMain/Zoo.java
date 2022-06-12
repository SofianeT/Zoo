package ZooMain;

import views.DashboardView;

public class Zoo {

    public static void main(String[] args) {
        System.out.println("--- Bienvenue dans l'application de gestion de Zoo ! 🦁🐳🦅 ---");

        DashboardView dashboard = new DashboardView();
        dashboard.start();


    }
}
