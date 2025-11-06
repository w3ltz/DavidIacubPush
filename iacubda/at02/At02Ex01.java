package iacubda.at02;

import java.util.Scanner;

public class At02Ex01 {

    static void problem1(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ecrivez un mot ou une phrase : ");
        String sTexte = scanner.nextLine();
        String sUpperCaseText = sTexte.toUpperCase();

        System.out.print(sUpperCaseText);

        scanner.close();
    }

    public static void main(String[] args) {
        problem1();
    }

}
