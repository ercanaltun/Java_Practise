package forLoop;

import java.util.Scanner;

public class C6 {

    public static void main(String[] args) {
                      /* Soru 8:
	 	Get the number of rows and columns from user.//Kullanicidan satır ve sütun alın.
	 	bir dikdörtgen olusturun
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir satır  degeri girin");
        int satir=scan.nextInt();
        System.out.println("lutfen bir sutun  degeri girin");
        int sutun=scan.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");

            } System.out.println("");


        }


    }
}