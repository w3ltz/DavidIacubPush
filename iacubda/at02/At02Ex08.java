package iacubda.at02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class At02Ex08 {
    static void problem8() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> mots = new ArrayList<>();

        System.out.println("Entrez des mots un par un (tapez 'stop' pour terminer) :");

        while (true) {
            System.out.print("Mot : ");
            String mot = scanner.nextLine().toLowerCase();

            if (mot.equals("stop")) {
                break;
            }

            mots.add(mot);
        }

        if (mots.isEmpty()) {
            System.out.println("Aucun mot saisi.");
        } else {
            Collections.sort(mots);
            System.out.println("Premier mot : " + mots.get(0));
            System.out.println("Dernier mot : " + mots.get(mots.size() - 1));
            
        }

        scanner.close();
    }

    public static void main(String[] args) {
        problem8();
    }

}
