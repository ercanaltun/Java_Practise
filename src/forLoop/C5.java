package forLoop;

import java.util.Scanner;

public class C5 {
    public static void main(String[] args) {

         /*  Soru 7:   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14

	     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1'den buyuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int karelerToplami=0;

        for (int i = 1; i <sayi ; i++) {
             karelerToplami +=i*i;
        }
        System.out.println(karelerToplami);




    }
}
