package day015;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Kullanıcı tarafından girilen sayının tek mi çift mi olduğunu bulan Java programını yazın.

        Scanner input=new Scanner(System.in);
        System.out.printf("Bir sayı giriniz = ");
        int sayi=input.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayı çifttir.");
        }else {
            System.out.println("Girilen sayı tektir.");
        }

        String sonuc=sayi%2==0?"Çift sayıdır.":"Tek sayıdır.";
        System.out.println(sonuc);
    }
}
