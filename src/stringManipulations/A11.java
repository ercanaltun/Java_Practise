package stringManipulations;

import java.util.Scanner;

public class A11 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin


    public static  void main(String [] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please entera four letter string");
        String input=scan.next();
        String backwardWord=input.substring(input.length()-1);
        for(int i=input.length()-2;i>=0;i--)
            backwardWord+=input.substring(i,i+1);


        System.out.println("backwardWord = " + backwardWord);


    }

}
