package iacubda.at01;

import java.util.Scanner;

public class At01Ex03 {

    static void problem3(){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Personne1 Age : ");
        double age1 = scanner.nextDouble();

        System.out.print("Personne2 Age : ");
        double age2 = scanner.nextDouble();

        double moyenne = (age1 + age2)/2;

        System.out.println("La moyenne de l'age est : " + moyenne);
        
        if (age1 > age2) {
            System.out.println("L'age le plus élevé est : " + age1);
        } else if (age2 > age1) {
            System.out.println("L'age le plus élevé est : " + age2);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        problem3();
    }

}
