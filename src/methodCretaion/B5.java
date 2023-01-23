package methodCretaion;

public class B5 {
    public static void main(String[] args) {
        /*
    Problem tanımı :interview sorusu
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */
        birKereYazdir("aaabbbbbbccccdddeee");
    }
    public static void birKereYazdir(String str) {

        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (!output.contains(str.substring(i, i + 1))) {       //tekrarsız karakterleri dondurecegimiz
                output += str.substring(i, i + 1);// icin sonucumuz str den aldıgımız
                // herhangi bir karakteri icermesin
            }

        }
        System.out.println(str + " nin tekrarsiz hali : " + output);
    }
}
