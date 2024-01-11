package day012;

import java.util.Scanner;

public class LogOpOrnek {
    public static void main(String[] args) {
        /*
            Verilen bir sayının hem 2'ye hem de 3'e bölünüp bölünmediğini bulan bir Java programı yazınız.
         */

        Scanner input=new Scanner(System.in);
        System.out.printf("1-100 arasında bölünmesini kontrol etmek istediğiniz sayıyı giriniz = ");
        int sayi= input.nextInt();

        if (sayi%3==0 & sayi%2==0){
            System.out.println("Sayı hem 2 hem de 3 ile kalansız bölünebilir.");
        } else if (sayi%3==0 & !(sayi%2==0)) {
            System.out.println("Sayı sadece 3 ile kalansız bölünebilir.");
        } else if (!(sayi%3==0) & sayi%2==0) {
            System.out.println("Sayı sadece 2 ile kalansız bölünebilir.");
        } else{
            System.out.println("Sayı 2 ve 3 ile kalansız bölünemez.");
        }
    }
}
