package StringManipulations;

import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla
         *  harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Please,enter a word");
        String word=scan.next();
        if(word.length()>2){
            word=word.substring(word.length()-2)+
                 word.substring(word.length()-2)+
                 word.substring(word.length()-2);
        }
        System.out.println("word = " + word);

    }
}
