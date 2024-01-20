package day022;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        //System.out.print("Cümle : ");
        //Scanner input=new Scanner(System.in);
        //while (input.hasNext()){
        //    System.out.println(input.next());
        //}


        //String cumle="i like the way you die, boy.";
        //Scanner input=new Scanner(cumle);
        //while (input.hasNext()){
        //    System.out.println(input.next());
        //}


        String cumle="i like the way you die, boy.";
        String[] kelimeler=cumle.split(" ");
        for (String kelime:kelimeler) {
            System.out.println(kelime);
        }
        System.out.println();

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i]);
        }
        System.out.println();

        int counter=0;
        while (counter< kelimeler.length){
            System.out.println(kelimeler[counter++]);
        }
    }
}
