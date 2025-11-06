package iacubda.at02;

import java.util.Scanner;

public class At02Ex05 {
    
    static void problem5(){
        Scanner scanner = new Scanner(System.in);

        for(int lettre = 0; lettre < 52; lettre++){
            if(lettre == 26) System.out.println();
            System.out.print((char)((lettre - (lettre % 26) == 0 ? lettre : (25 - (lettre % 26)))+65));
        }

        scanner.close();
    }

    public static void main(String[] args) {
        problem5();
    }

}
