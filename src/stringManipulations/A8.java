package stringManipulations;

import java.util.Scanner;

public class A8 {

            /*
         Kullanicidan bir kelime girmesini isteyin.
         * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
         * kelimenin ortasindaki karakteri yazdirin.


                Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str=scan.next();
        char ortancaKarakter=str.charAt((str.length()-1)/2);
        if (str.length()%2==1 && str.length()>=3){
            System.out.println("ortancaKarakter = " + ortancaKarakter);
        }
        */

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a statement");
        String str=scan.next();
        if(str.length()>=3 || (str.length()-1)/2 ==0){
            char middleCharacter=str.charAt((str.length()-1)/2);
            System.out.println("middleCharacter = " + middleCharacter);
        }

    }
}
