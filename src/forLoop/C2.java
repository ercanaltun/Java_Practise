package forLoop;

public class C2 {
    public static void main(String[] args) {

        // Soru 4: 0-255 e kadar olan harflerin ,
        // sayı ve harf değerini ekrana yazdırınız.


        //1. yöntem fori ile:
        for (int i = 0; i <=255 ; i++) {
            char harf= (char) i;//casting yaparak int 'ı char 'a dondurduk
            System.out.println(i +" ->"+harf);
        }

        //2.yöntem while ile:
        int i=0;
        while (i<=255){
            char sembol= (char) i;
            System.out.println(i+"-"+sembol);
            i++;
        }

        //3.yöntem doWhile ile:
        int a =0;
        do {
            char karakter= (char) a;
            System.out.println(a+" "+karakter);
            a++;
        }while (a<=255);









    }
}
