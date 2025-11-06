package iacubda.at02;

import java.util.Scanner;

public class At02Ex07 {
    static void problem7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un mot ou une phrase : ");
        String phrase = scanner.nextLine().toLowerCase();

        int voyelles = 0;
        int consonnes = 0;

        for(int i = 0; i < phrase.length(); i++){
            char c = phrase.charAt(i);

            if (Character.isLetter(c)) { 
                if ("aeiouy".indexOf(c) != -1) {
                    voyelles++;
                } else {
                    consonnes++;
                }
            }
        }
        System.out.println("Consonnes : " + consonnes);
        System.out.println("Voyelles : " + voyelles);

        scanner.close();

    }

    public static void main(String[] args) {
        problem7();
    }

}
