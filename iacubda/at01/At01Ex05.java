package iacubda.at01;

import java.util.Scanner;

public class At01Ex05 {

    static void problem5(){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Entrez votre montant : ");
        double montant = scanner.nextDouble();

        double rabais = (montant)*0.25 ;
        double prixfinal = (montant - rabais);

        System.out.println("votre montant final est : " + prixfinal + " $" );


        scanner.close();
    }



    public static void main(String[] args) {
        problem5();
    }

}
