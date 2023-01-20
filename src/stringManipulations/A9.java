package stringManipulations;

import java.util.Scanner;

public class A9 {

    // Kullanicidan isim ve soyismini girmesini isteyin
    // ve hangisinin daha uzun oldugunu yazdirin

    public static void main(String[] args){


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.next();
        System.out.println("Please enter your Surname");
        String surName=scan.next();

        if(name.length()>surName.length()){
            System.out.println("name length longer then surName");
        }else if(surName.length()>name.length()){
            System.out.println("surName length longer then name");
        }else {
            System.out.println("surName length equals name length");
        }







    }
}
