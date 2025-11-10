package iacubda.at03;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        String Tfruit [][] = new String[3][10];
        Scanner scanner = new Scanner(System.in);
        int j , i;


        for(j = 0 ; j < 3 ; j++){
            for(i = 0 ; i < 10 ; i++){
                System.out.print("Entrez un fruit : ");
                Tfruit [j][i] = scanner.nextLine();

            }
        }
        scanner.close();


        System.out.println("\nVoici les fruits saisis :");
        for ( j = 0; j < 3; j++) {
            System.out.println("Catégorie " + (j + 1) + " :");
            for ( i = 0; i < 10; i++) {
                System.out.println(" - " + Tfruit[j][i]);
            }
        }


    }
}
