package iacubda.at01;

import java.util.Scanner;

public class At01Ex01 {

    static void problem1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double dNombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double dNombre2 = scanner.nextDouble();

        if (dNombre1 > dNombre2) {
            System.out.println("Le nombre le plus élevé est : " + dNombre1);
        } else if (dNombre2 > dNombre1) {
            System.out.println("Le nombre le plus élevé est : " + dNombre2);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        problem1();
    }

}
