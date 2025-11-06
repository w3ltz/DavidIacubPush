package iacubda.at02;

import java.util.Scanner;

public class At02Ex13 {
    public static void main(String[] args) {
        double temperature = 0;
        String conversion;

        Scanner entree = new Scanner(System.in);
        System.out.print("Entrer une température : ");
        temperature = entree.nextDouble();
        entree.nextLine(); 
        do{
            System.out.print("Vers (C/c)elsius ou vers (F/f)ahrenheit : ");
            conversion = entree.nextLine();
        } while(conversion.toLowerCase().equals("f") == false && conversion.toLowerCase().equals("c") == false);

        System.out.println("Température : " +
            (
                conversion.toLowerCase().equals("f") ?
                temperature * 9 / 5 + 32 :
                (temperature - 32) * 5 / 9
                
            )
            + "°" + conversion.toUpperCase()
        );

        entree.close();
    }
}
