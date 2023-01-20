package stringManipulations;

import java.util.Scanner;

public class A6 {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false
     *  return eden metod yaziniz
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

 public static void main(String[] args){

     Scanner scan=new Scanner(System.in);
     System.out.println("Please,enter a statement");
     String str=scan.next().toLowerCase();

     System.out.println(xyzVarMi(str));


 }

    private static boolean xyzVarMi(String str) {

     if (str.contains("xyz")){
         return true;
     }

     return false;
    }


}
