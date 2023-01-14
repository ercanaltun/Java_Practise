package StringManipulations;

import java.util.Scanner;

public class A5 {

    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip  ilk harfi büyük ve sonuna . koyun
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please,enter first word");
        String word1=(scan.next().toUpperCase().substring(0));
        String firstLetter=word1.substring(0,1);
        String otherLetters=word1.toLowerCase().substring(1);
        word1=firstLetter+otherLetters;
        System.out.println("Please,enter second word");
        String word2=scan.next().toLowerCase();
        System.out.println("Please,enter third word");
        String word3=scan.next().toLowerCase();
        System.out.println("Please,enter fourt word");
        String word4=scan.next().concat(".").toLowerCase();

        String statement=word1+" "+word2+" "+word3+" "+word4;
        System.out.println("statement = " + statement);


    }
}
