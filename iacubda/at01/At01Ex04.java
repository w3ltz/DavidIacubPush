package iacubda.at01;

import java.util.Scanner;

public class At01Ex04 {

    static void problem4(){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Quelle est votre note d'examen sur 100 : ");
        double note = scanner.nextDouble();

        if (note >= 60) {
            System.out.println("Reussite");
        } else if (note < 60) {
            System.out.println("Échec" );
        } 

        scanner.close();
    }

    public static void main(String[] args) {
        problem4();
    }

}


