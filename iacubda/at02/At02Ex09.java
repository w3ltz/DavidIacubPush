package iacubda.at02;

import java.util.Scanner;

public class At02Ex09 {
     static void problem9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rayon du cerle : ");
        double dRayon = scanner.nextDouble();

        double dCirconference = 2 * Math.PI * dRayon;
        System.out.print("La circonference du cercle est :  " + dCirconference);

        scanner.close();
    }

    public static void main(String[] args) {
        problem9();
    }

}
