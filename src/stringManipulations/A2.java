package stringManipulations;

import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {

 // Scanner kullanarak iki ayri deger giriniz ve
// bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
// yukardaki ornekte verilen ilk ve ikinci degiskenlerinin
// ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir String ifade girin");
        String word1=scan.next();
        System.out.println("Luften 2. bir String ifade girin");
        String word2=scan.next();
        word1=word1.substring(1);
        System.out.println("word1 = " + word1);
        word2=word2.substring(1);
        String wordsConcat=word1+word2;
        System.out.println("wordsConcat = " + wordsConcat);


    }
}
