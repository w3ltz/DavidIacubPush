package iacubda.at02;

import java.util.Scanner;

public class At02Ex10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un premier nombre entier : ");
        int iNombre1 = scanner.nextInt();

        System.out.print("Entrez un deuxieme nombre entier : ");
        int iNombre2 = scanner.nextInt();

        int iResultat = plusGrand(iNombre1,iNombre2);

        System.out.print("Le plus grand nombre est : " + iResultat);

        scanner.close();
    }

    public static int plusGrand(int a,int b){
        if(a > b){
            return a; 
        }else{
            return b;
        }
    }

}
