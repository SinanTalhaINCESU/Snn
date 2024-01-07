package day009;

import java.util.Scanner;

public class InputWithScanner {
    public static void main(String[] args) {

        //Klavyeden girilen 2 adet tamsayının toplamını buldurup, ekrana yazdıran bir Java programı yazın.

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz = ");
        int sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz = ");
        int sayi2=input.nextInt();
        int toplam=sayi1+sayi2;

        System.out.println("Sayıların Toplamı = "+toplam);

    }
}
