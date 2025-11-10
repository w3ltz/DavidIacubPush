package iacubda.at03;

import java.util.Scanner;

public class At03Ex08 {

public static double moyEval(double[] notes) {
        double somme = 0;
        for (double n : notes) {
            somme += n;
        }
        return somme / notes.length;
    }

    //méthode pour calculer la moyenne de chaque étudiant
    public static double[] moyEtu(double[] tp1, double[] tp2, double[] examen) {
        int nbEtudiants = tp1.length;
        double[] moyennes = new double[nbEtudiants];

        for (int i = 0; i < nbEtudiants; i++) {
            moyennes[i] = (tp1[i] + tp2[i] + examen[i]) / 3.0;
        }
        return moyennes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Déclaration des tableaux
        String[] noms = new String[8];
        double[] tp1 = new double[8];
        double[] tp2 = new double[8];
        double[] examen1 = new double[8];

        //Saisie des données
        for (int i = 0; i < 8; i++) {
            System.out.print("Nom de l'étudiant " + (i + 1) + " : ");
            noms[i] = scanner.nextLine();

            System.out.print("Note TP1 : ");
            tp1[i] = scanner.nextDouble();

            System.out.print("Note TP2 : ");
            tp2[i] = scanner.nextDouble();

            System.out.print("Note Examen1 : ");
            examen1[i] = scanner.nextDouble();
            scanner.nextLine(); // vider le buffer
            System.out.println();
        }

        //Calcul des moyennes
        double moyTP1 = moyEval(tp1);
        double moyTP2 = moyEval(tp2);
        double moyExamen1 = moyEval(examen1);

        double[] moyennesEtudiants = moyEtu(tp1, tp2, examen1);

        //Affichage des résultats
        // % = début du formatage
        // .2 = 2 chiffre apres la virgule
        // f = nombre à virgule flottante (Float ou double)
        // %n = saut de ligne portable (équivalent de \n)
        System.out.println("\n=== Moyennes des évaluations ===");
        System.out.printf("TP1 : %.2f\n", moyTP1);
        System.out.printf("TP2 : %.2f\n", moyTP2);
        System.out.printf("Examen1 : %.2f\n", moyExamen1);

        // %s = affiche une chaine de caractere (String) = noms[i]
        // %.2f = Affiche un nombre à virgule (float ou double) avec 2 chiffres après la virgule = moyennesEtudiants[i]
        System.out.println("\n=== Moyenne par étudiant ===");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%s : %.2f\n", noms[i], moyennesEtudiants[i]);
        }

        scanner.close();
    }

}

