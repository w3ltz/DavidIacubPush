package iacubda.at01;

import java.util.Scanner;

public class At01Ex02 {

    static void problem2(){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Entrez votre salaire : ");
        double nombreSalaire = scanner.nextDouble();

        System.out.print("Entrez votre nombre d'heure par semaine : ");          
        double nombreHeure = scanner.nextDouble();

        double salaire = nombreHeure * nombreSalaire *2;

        System.out.println("Votre salaire est de : " + salaire + " $");

        scanner.close();
    }

    public static void main(String[] args) {
        problem2();
    }

}
