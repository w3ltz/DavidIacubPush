package iacubda.at02;

import java.util.Scanner;

public class At02Ex04 {

    static void problem4(){
        int iNombre;
        
        Scanner scanner = new Scanner(System.in);

       
        do{
            System.out.print("entrez un nombre entre 0-100 : ");
            iNombre = scanner.nextInt();

        }while (iNombre < 1 || iNombre > 100);


        scanner.close();
    }

    public static void main(String[] args) {
        problem4();
    }


}
