package iacubda.at02;

import java.util.Scanner;

public class At02Ex03 {

    static void problem3(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ecrivez une phrase : ");
        String sTexte = scanner.nextLine();
        String sUpperCaseTexte = sTexte.toUpperCase();
        char targetLetter = 'A';

        int count = 0;
        for(int i = 0; i < sUpperCaseTexte.length(); i++){
            if(sUpperCaseTexte.charAt(i) == targetLetter){
                count++;
            }

        }

        char oldChar = 'A';
        char newChar = '$';

        String sPhrase = sUpperCaseTexte.replace(oldChar, newChar);

        System.out.println(sPhrase + " il ya " + count + " A dans cette phrase");

        scanner.close();
    }


    public static void main(String[] args) {
        problem3();
        
    }

}
