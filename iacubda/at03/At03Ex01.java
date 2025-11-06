package iacubda.at03;

public class At03Ex01 {
    public static void main(String[] args) {

        //Déclaration du tableau de String de longueur 5
        String[] mot = new String [5];

        //Insertion de mots dans chaque case
        mot[0] = "David";
        mot[1] = "Ensky";
        mot[2] = "Momo";
        mot[3] = "Joyce";
        mot[4] = "Saad";


        // Tableau avec seulement les mots
        System.out.println("mot seulement :");
        for (String sMot : mot){
            System.out.println(sMot);
        }

        // Tableau avec le chiffre
        System.out.println("\nAvec chiffre :");
        for (int i = 0; i < mot.length; i++) {
            System.out.println(i +" : " + mot[i]);
        }
    }
}
