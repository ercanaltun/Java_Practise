package forLoop;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {

                    /*
        Soru 3: 100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13
          */

        int num=100;
         int bolenler;
         int toplamBolenler=0;
        for (int i=100; i>0; i--){
            if (i%13==0){
                bolenler=i;
                System.out.println(bolenler);
                toplamBolenler+=bolenler;
            }
        } System.out.println("Bolen sayilarin toplami = "+toplamBolenler);


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();
        int topBolen=0;
        if (sayi<100){
            for (int i=sayi;i>=0;i--) {
                if (i%13==0){
                    System.out.println(+i);
                    topBolen +=i;

                }
            }
            System.out.println("");
            System.out.println("Bolen sayilarin toplami = "+topBolen);

        }else{  System.out.println("Lutfen 100'den kucuk bir sayi giriniz");
        }


    }
}
