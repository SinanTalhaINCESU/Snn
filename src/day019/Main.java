package day019;

public class Main {
    public static void main(String[] args) {

        //Arrays and Strings
        //int numbers[];

        int[] sayilar={1,3,5};
        System.out.println(sayilar[0]);
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        //System.out.println(sayilar[3]);  HATALI!

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+" ");
        }
        System.out.println();
        for (int i=sayilar.length-1; i>=0; i--) {
            System.out.print(sayilar[i]+" ");
        }
    }
}
