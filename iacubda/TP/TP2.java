package iacubda.TP;

import java.util.Scanner;


public class TP2 {

    static Scanner clavier = new Scanner(System.in);

    static final String[] EQUIPES = {
            "Junior Montreal",
            "Remparts Quebec",
            "Aigles Laval",
            "Éperviers Terrebonne"
    };

    static final String[] CODES = {"MON", "QUE", "LAV", "TER"};

    // PJ, V, D, N, PTS
    static int[][] stats = new int[4][5];

    public static void main(String[] args) {

        System.out.println("TRAVAIL PRATIQUE #3");
        System.out.println("--------------------------------------");

        demanderResultats();
        afficherClassement();
    }

    // ================= MÉTHODE 1 =================
    // Demande les résultats des matchs
    public static void demanderResultats() {

        char continuer;

        do {
            int visiteur = saisirEquipe("Équipe visiteuse");
            int butsVisiteur = saisirButs("Nombre de buts (visiteur)");

            int local;
            do {
                local = saisirEquipe("Équipe locale");
                if (local == visiteur) {
                    System.out.println("Erreur : même équipe pour visiteur et local.");
                }
            } while (local == visiteur);

            int butsLocal = saisirButs("Nombre de buts (local)");

            mettreAJourStats(visiteur, local, butsVisiteur, butsLocal);

            System.out.print("\nVoulez-vous entrer un autre match ? (O/N) : ");
            continuer = clavier.next().toUpperCase().charAt(0);

        } while (continuer == 'O');
    }

    // ================= MÉTHODE 2 =================
    // Calcul et mise à jour des points et statistiques
    public static void mettreAJourStats(int v, int l, int butsV, int butsL) {

        stats[v][0]++; // PJ
        stats[l][0]++; // PJ

        if (butsV > butsL) {
            stats[v][1]++; // V
            stats[l][2]++; // D
            stats[v][4] += 3;
        } else if (butsV < butsL) {
            stats[l][1]++;
            stats[v][2]++;
            stats[l][4] += 3;
        } else {
            stats[v][3]++; // N
            stats[l][3]++;
            stats[v][4] += 1;
            stats[l][4] += 1;
        }
    }

    // ================= MÉTHODE 3 =================
    // Affiche le classement final
    public static void afficherClassement() {

        System.out.println("\nClassement");
        System.out.println("Équipe\t\t\tPJ V D N PTS");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.printf(
                    "%-20s %2d %2d %2d %2d %3d%n",
                    EQUIPES[i],
                    stats[i][0], stats[i][1], stats[i][2],
                    stats[i][3], stats[i][4]
            );
        }
    }

    // ================= MÉTHODES UTILITAIRES =================

    public static int saisirEquipe(String message) {

        while (true) {
            System.out.print(message + " (MON/QUE/LAV/TER ou 1-4) : ");
            String entree = clavier.next().toUpperCase();

            // Par numéro
            if (entree.matches("[1-4]")) {
                return Integer.parseInt(entree) - 1;
            }

            // Par code
            for (int i = 0; i < CODES.length; i++) {
                if (entree.equals(CODES[i])) {
                    return i;
                }
            }

            System.out.println("Équipe invalide.");
        }
    }

    public static int saisirButs(String message) {
        int buts;

        do {
            System.out.print(message + " : ");
            while (!clavier.hasNextInt()) {
                clavier.next();
                System.out.print("Nombre invalide. Réessayez : ");
            }
            buts = clavier.nextInt();
        } while (buts < 0);

        return buts;
    }

}
