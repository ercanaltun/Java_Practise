package StringManipulations;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {


//Kullanicidan ismini ve soyisimi girmesini isteyin,
// sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi girin");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi girin");
        String soyisim=scan.next();
        String isimSoyisim=isim.toUpperCase().concat(" "+soyisim);
        System.out.println(isimSoyisim);


    }
}
