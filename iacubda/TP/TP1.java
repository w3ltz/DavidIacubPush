package iacubda.TP;

import java.util.Scanner;

public class TP1 {
    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        int choix;

        do {
            afficherMenu();
            choix = saisirChoixMenu();

            switch (choix) {
                case 1:
                    transformerMonnaie();
                    break;
                case 2:
                    jeuNombreMystere();
                    break;
                case 3:
                    System.out.println("Fin du programme. Au revoir !");
                    break;
            }

        } while (choix != 3);
    }

    // ================= MENU =================

    public static void afficherMenu() {
        System.out.println("\nTRAVAIL PRATIQUE #1 - Votre Nom");
        System.out.println("--------------------------------");
        System.out.println("1) Transformer $$$ en monnaie");
        System.out.println("2) Jeu trouver un nombre mystère");
        System.out.println("3) Quitter");
        System.out.print("Choix : ");
    }

    public static int saisirChoixMenu() {
        int choix;

        while (true) {
            if (clavier.hasNextInt()) {
                choix = clavier.nextInt();
                if (choix >= 1 && choix <= 3) {
                    return choix;
                }
            } else {
                clavier.next(); // vider entrée invalide
            }
            System.out.print("Choix invalide. Entrez 1, 2 ou 3 : ");
        }
    }

    // ================= EXERCICE 1 =================

    public static void transformerMonnaie() {

        double montant;

        do {
            System.out.print("\nEntrez un montant positif : ");
            montant = clavier.nextDouble();
        } while (montant <= 0);

        // Conversion en cents pour éviter les erreurs de décimales
        int cents = (int) Math.round(montant * 100);

        int[] valeurs = {10000, 5000, 2000, 1000, 500, 200, 100, 25, 10, 5, 1};
        String[] libelles = {
                "100$", "50$", "20$", "10$", "5$", "2$", "1$",
                "0,25$", "0,10$", "0,05$", "0,01$"
        };

        System.out.println("\nMonnaie pour " + montant + "$ :");

        for (int i = 0; i < valeurs.length; i++) {
            int nb = cents / valeurs[i];
            if (nb > 0) {
                System.out.println(nb + " x " + libelles[i]);
                cents %= valeurs[i];
            }
        }
    }

    // ================= EXERCICE 2 =================

    public static void jeuNombreMystere() {

        final int NOMBRE_MAX = 20;
        final int MAX_CHANCES = 7;

        int nombreMystere = (int) (Math.random() * NOMBRE_MAX) + 1;
        int tentative;
        boolean trouve = false;

        System.out.println("\nDevinez le nombre mystère (entre 1 et 20)");
        System.out.println("Vous avez " + MAX_CHANCES + " chances.");

        for (int i = 1; i <= MAX_CHANCES; i++) {

            System.out.print("Tentative " + i + " : ");

            while (!clavier.hasNextInt()) {
                clavier.next();
                System.out.print("Entrez un nombre valide : ");
            }

            tentative = clavier.nextInt();

            if (tentative < 1 || tentative > 20) {
                System.out.println("Nombre hors limites (1 à 20).");
                i--; // ne compte pas comme une chance
            } else if (tentative < nombreMystere) {
                System.out.println("Plus grand !");
            } else if (tentative > nombreMystere) {
                System.out.println("Plus petit !");
            } else {
                System.out.println("Bravo ! Vous avez trouvé le nombre mystère !");
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("Dommage ! Le nombre mystère était : " + nombreMystere);
        }
    }


}
