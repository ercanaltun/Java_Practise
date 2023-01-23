package methodCretaion;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
                             /* interwiev sorusu
       Soru2: Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 47 'den kucuk bir sayi giriniz");
        int sayi = scan.nextInt();
        fibonacci(sayi);

    }
    public static void fibonacci(int sayi) {
        int sonSsayi = 0;
        int ilkSayi = 0;
        int ikinciSayi = 1;
        if (sayi<47 && sayi>0){
            for (int i = 0; i <sayi ; i++) {

                System.out.print(ilkSayi+"-");
                sonSsayi=ilkSayi+ikinciSayi;
                ilkSayi=ikinciSayi;
                ikinciSayi=sonSsayi;

            }
        }else{ System.out.println("Lutfen 47 'den kucuk veya pozitif bir sayi giriniz");
        }
    }
}
