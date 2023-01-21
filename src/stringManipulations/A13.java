package stringManipulations;

import java.util.Scanner;

public class A13 {

    // Soru 7 ) Interview Question Kullanicidan bir String isteyin ve
    // Stringi tersten yazdirin.


    public static  void main(String [] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime gir");
        String str=scan.next();

        terstenYazdir(str);


    }

    private static void terstenYazdir(String str) {

        String ters=str.substring(str.length()-1);
        for (int i=str.length()-2;i>=0;i--) {
            ters += str.substring(i, i + 1);

        }
        System.out.println("ters = " + ters);
    }



}
