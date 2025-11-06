package iacubda.at03;

import java.util.Scanner;

public class At03Ex02 {

    public static void main(String[] args) {
        
        double[] iNombre = new double [10]; //tableau de réels de 10 chiffres
        Scanner scanner = new Scanner(System.in);

        //demande a l'utilisateur de saisir 10 nombre réels
        for(int i = 0; i < iNombre.length; i++){
            System.out.print("entrez le nombre réel #" + (i + 1) + " : ");
            iNombre[i] = scanner.nextDouble();
        }
        //affiche le tableau avec les 10 chiffres
        System.out.println("\n-- Contenu du tableau --");
        for (int i = 0; i < iNombre.length; i++) {
            System.out.println(i +" : " + iNombre[i]);
        }
        scanner.close();
    }
}
