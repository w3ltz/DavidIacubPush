package iacubda.at03;

import java.util.Random;

public class At03Ex05 {

    // Méthode paramétrée pour afficher un tableau d'entiers
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Numéro " + i + " : " + tableau[i]);
        }
    }

    // Méthode pour permuter le tableau
    public static void permuterTableau(int[] tableau) {
        int n = tableau.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = tableau[i];
            tableau[i] = tableau[n - 1 - i];
            tableau[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        // Déclaration du tableau de longueur 10
        int[] tableau = new int[10];

        // Remplir le tableau avec des nombres aléatoires entre 0 et 100
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); // 0 à 99 inclus
        }

         // Afficher le tableau initial
        System.out.println("--- Tableau Random ---");
        afficherTableau(tableau);

        // Permuter les cases
        permuterTableau(tableau);

        // Afficher le tableau après permutation
        System.out.println("--- Tableau après permutation ---");
        afficherTableau(tableau);
    }

    

}
