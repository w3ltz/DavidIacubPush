package iacubda.at02;

import java.util.Scanner;

public class At02Ex02 {

    static void problem2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("ecrivez un mot ou une phrase : ");
        String sTexte = scanner.nextLine();
        int iCharactherCount = sTexte.length();

        System.out.print(iCharactherCount);

        scanner.close();
    }


    public static void main(String[] args) {
        problem2();
    }

}
