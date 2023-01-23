package forLoop;

public class C7 {
    public static void main(String[] args) {

         /* Soru 9:Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        String input = "Canim ailem";

        tersString(input);
    }

    public static String tersString(String input) {
        String ilkHali=input;
        String ters="";
        for (int i = input.length()-1; i>=0; i--) {
            ters += input.charAt(i);
        }
        System.out.println(ilkHali+" cumlesinin tersi : "+ters);

        return ters;
    }
}
