package stringManipulations;

import java.util.Scanner;

public class A12 {

      /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static  void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter kind of math's mark");
        int mathMark=scan.nextInt();
        System.out.println("enter first number");
        double num1= scan.nextInt();
        System.out.println("enter second number");
        double num2=scan.nextInt();
        
        fourMathsDo(num1,num2,mathMark);


        }

    private static void fourMathsDo(double num1, double num2, int mathMark) {
        
        
        switch (mathMark){
            
            case 1 : System.out.println("sum of numbers = " + (num1+num2));break;
            case 2 : double subtract=num1-num2; System.out.println("subtract of numbers = "+subtract);break;
            case 3 : System.out.println("multiply of numbers = " +num1*num2);break;
            case 4 : double divide=num1/num2; System.out.println("divide of numbers = "+divide);break;
            default: System.out.println("Please a correct numeric value for maths");


        }
        
        
        
        
    }
    
}

