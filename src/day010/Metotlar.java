package day010;

import java.util.Scanner;

public class Metotlar {
    public static void main(String[] args) {

        //Verilen bir sayının karesini hesaplayan Java programını yazınız.

        int sayi=3;
        int kare=sayi*sayi;
        System.out.println("Sayının karesi = "+kare);


        Scanner input=new Scanner(System.in);
        System.out.printf("Karesi hesaplanacak sayıyı giriniz : ");
        int kare2= input.nextInt();

        System.out.println("Sayının karesi = "+(kare2*kare2));

        kareAl();
        kareAl2(9);
    }

    public static void kareAl(){
        int sayi=7;
        int kare3=sayi*sayi;
        System.out.println("Sayının karesi = "+kare3);
    }

    public static void kareAl2(int sayi){
        int kare4=sayi*sayi;
        System.out.println("Sayının karesi : "+kare4);
    }
}
