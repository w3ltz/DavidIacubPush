package iacubda.at03;

import java.util.Random;


public class At03Ex04 {

    public static void main(String[] args) {
        
        Random random = new Random();

        // Déclaration du tableau de longueur 5
        int[] tableau = new int[5];

        // Remplir le tableau avec des nombres aléatoires entre 0 et 100
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); // 0 à 99 inclus
        }

        // Afficher le tableau
        System.out.println("--- Tableau Random ---");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Numéro " + i + " : " + tableau[i]);
        }

        // Initialisation des valeurs pour plus grand et plus petit 
        // et leur position dans le tableau
        int min = tableau[0];
        int max = tableau[0];
        int posMin = 0;
        int posMax = 0;

        // Parcours le tableau pour voir quel chiffre est le plus gros
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
                posMin = i;
            }
            if (tableau[i] > max) {
                max = tableau[i];
                posMax = i;
            }
        }
        // Affichage des résultats
        System.out.println("--- Résultats ---");
        System.out.println("Plus grand nombre : " + max + " pos " + posMax );
        System.out.println("Plus petit nombre : " + min + " pos " + posMin );
    }
}
