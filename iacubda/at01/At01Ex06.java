package iacubda.at01;

import java.util.Scanner;

public class At01Ex06 {

    static void problem6(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom de client : ");
        String sClient = scanner.nextLine();

        System.out.print("Entrez votre choix parmi les choix suivant 1- Chêne 2- Érable 3- Pin: ");
        double dNombreChoisi = scanner.nextDouble();
        


        if(dNombreChoisi == 1){ 
            System.out.print("Longeur mètre : ");
            double dLongueur = scanner.nextDouble();
            System.out.print("Largeur mètre : ");
            double dLargeur = scanner.nextDouble();

            double dAirPlanche = dLargeur * dLongueur;
            double dPrix = 5 * dAirPlanche;
            System.out.println("Nom du client " + sClient);
            System.out.println("Surface de la planche " + dAirPlanche);
            System.out.println("Prix de la planche " + dPrix + " $");

        }else if(dNombreChoisi == 2){ 
            System.out.print("Longeur mètre : ");
            double dLongueur = scanner.nextDouble();
            System.out.print("Largeur mètre : ");
            double dLargeur = scanner.nextDouble();

            double dAirPlanche = dLargeur * dLongueur;
            double dPrix = 12 * dAirPlanche;
            System.out.println("Nom du client " + sClient);
            System.out.println("Surface de la planche " + dAirPlanche);
            System.out.println("Prix de la planche " + dPrix + " $");

        }else if (dNombreChoisi == 3){
            System.out.print("Longeur mètre : ");
            double dLongueur = scanner.nextDouble();
            System.out.print("Largeur mètre : ");
            double dLargeur = scanner.nextDouble();

            double dAirPlanche = dLargeur * dLongueur;
            double dPrix = 10 * dAirPlanche;
            System.out.println("Nom du client " + sClient);
            System.out.println("Surface de la planche " + dAirPlanche);
            System.out.println("Prix de la planche " + dPrix + " $");

        }else{
            System.out.print("Vous n'avez pas choisit le bon type de plancher");
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
        problem6();
    }

}
