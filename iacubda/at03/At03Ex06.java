package iacubda.at03;



public class At03Ex06 {
    public static void main(String[] args) {
        

        // Déclaration du tableau de longueur 10
        int[] tableau = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11};
        int sommePos = 0;
        int sommeNeg = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] >= 0) {
                sommePos += tableau[i];
            } else {
                sommeNeg += tableau[i]; // <-- missing semicolon fixed
            }
        }

        // Affichage clair des résultats
        System.out.print("Tableau : ");
        for (int affichetableau : tableau) {
            System.out.print(affichetableau + " ");
        }
        System.out.println(); // saut de ligne

        System.out.println("Somme des positifs : " + sommePos);
        System.out.println("Somme des négatifs : " + sommeNeg);
    }

}
