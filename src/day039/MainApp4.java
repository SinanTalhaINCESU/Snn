package day039;

import java.util.Arrays;

public class MainApp4 {
    public static void main(String[] args) {


        String str="Ben bir garip keloğlanım.";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println("Dizinin Lengthi : "+kelimeler.length);
        System.out.println();
        for (String kelime:kelimeler) {
            System.out.println(kelime);
        }
    }
}
