package iacubda.at03;

import java.util.Random;
import java.util.Scanner;

public class At03Ex03 {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        int[] tableau1 = new int[taille];
        int[] tableau2 = new int[taille];


        for (int i = 0; i < tableau1.length; i++) {
            tableau1[i] = random.nextInt(100);
        }
        for (int i = 0; i < tableau1.length; i++) {
            tableau2[i] = tableau1[tableau1.length - 1 - i];
        }

        System.out.println("\n--- Tableau 1 ---");
        for (int i = 0; i < tableau1.length; i++) {
            System.out.print(tableau1[i] + " ");
        }
        System.out.println("\n--- Tableau 2 ---");
        for (int i = 0; i < tableau2.length; i++) {
            System.out.print(tableau2[i] + " ");
        }
        
        scanner.close();
    }

}
