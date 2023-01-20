package stringManipulations;

public class A3 {

    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="$10.99";
        Double first= Double.parseDouble(str1.replace("$",""));
        Double second=Double.parseDouble(str2.replace("$",""));
        Double sum=first+second;
        System.out.println("sum = " + sum);


    }
}
