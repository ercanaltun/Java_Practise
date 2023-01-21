package stringManipulations;

import java.util.Scanner;

public class A14 {

    //Kullanicidan iki keline isteyin.İki kelimeyi
    //(ilk kelime yarısı+ikinci kelime+ilk kelimenin ikinci yarısı)
    //şeklinde birleştirin.ilk kelime tekse
    // "1.kelimeyi uzunluğu çift sayı girin"uyarısı versin

    public static  void main(String [] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime gir");
        String str1=scan.next();
        System.out.println("ikinci kelimeyi gir");
        String str2=scan.next();
        String concat="";

        if(str1.length()%2==0){
            concat=str1.substring(0,str1.length()/2)+str2+str1.substring(str1.length()/2);
        }
        System.out.println("concat = " + concat);



    }

}
