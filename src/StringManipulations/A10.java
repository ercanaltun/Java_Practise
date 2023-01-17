package StringManipulations;

import java.util.Scanner;

public class A10 {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin
    // olup olmadigini kontrol ediniz.

    public  static  void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a statement");
        String str=scan.nextLine();
        if(str.contains(" ")){
            System.out.println("There is a space character in your statement");
        }else {
            System.out.println("There isn't any space character in your statement");

        }
    }

}
