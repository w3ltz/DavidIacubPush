package iacubda.At03;

import java.util.Random;

public class At03Ex07 {

    public static void main(String[] args) {
        Random random = new Random();

        //Déclarer un tableau d'entiers de longueur 10
        int[] tableau = new int[10];

        //Remplir le tableau avec des nombres aléatoires entre 0 et 4
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(5); //génère un entier entre 0 et 4
        }

        //Créer un nouveau tableau pour stocker le nombre d'occurrences de chaque chiffre (0 à 4)
        int[] occurrences = new int[5];

        //Utiliser une méthode paramétrée pour compter combien de fois chaque nombre apparaît
        for (int i = 0; i < occurrences.length; i++) {
            occurrences[i] = compterOccurrences(tableau, i);
        }

        //Afficher le tableau et le nombre d'occurrences pour chaque élément
        afficherTableau(tableau);
        afficherOccurrences(occurrences);
    }

    //Méthode paramétrée : compte le nombre d'occurrences d'un nombre donné dans un tableau
    public static int compterOccurrences(int[] tab, int nombre) {
        int compteur = 0;
        for (int n : tab) {
            if (n == nombre) {
                compteur++;
            }
        }
        return compteur;
    }

    //Méthode pour afficher le contenu du tableau principal
    public static void afficherTableau(int[] tab) {
        System.out.print("Tableau : ");
        for (int n : tab) {
            System.out.print(n + " ");
        }
        System.out.println(); //retour à la ligne
    }

    //Méthode paramétrée pour afficher le nombre d'occurrences de chaque élément (0 à 4)
    public static void afficherOccurrences(int[] occ) {
        System.out.println("Occurrences :");
        for (int i = 0; i < occ.length; i++) {
            System.out.println(i + " apparaît " + occ[i] + " fois.");
        }
    }

}
