package stringManipulations;

import java.util.Scanner;

public class A7 {

             /*
name1 ve name2 degiskenlerini olusturun.
name1 degiskeninin karakter sayisi cift ise
kelimenin ortasina name2 yi yerlestirin.
name1 degiskeninin karakter sayisi tek ise
"name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
*/
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please nter first name");
        String name1=scan.next().toLowerCase();
        System.out.println("Please enter second name");
        String name2=scan.next();
        String concatTwoNames="";

        if(name1.length() %2==0){
            concatTwoNames=name1.substring(0,name1.length()/2).concat(name2.concat(name1.substring(name1.length()/2)));
            System.out.println(concatTwoNames);

        }else{
            System.out.println("First name should be an even numered name ");
        }

    }
}
