package day009;

import java.util.Scanner;

public class TaskWithScanner {
    public static void main(String[] args) {

        /*
            TASK: Klavyeden girilen 2 sayının çarpımını bulan ve ekrana yazdıran bir Java programı yazın.
         */

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz = ");
        int sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz = ");
        int sayi2=input.nextInt();
        int carpim=sayi1*sayi2;

        System.out.println("Sayıların Çarpımı = "+carpim);
    }
}
