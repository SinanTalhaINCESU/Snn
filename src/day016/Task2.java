package day016;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
            Alan ve Çevre Hesaplama
            1. Kare
            2. Daire
            Seçiminiz:

            Yukarıdaki menüyü tasarlayınız.
            Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazın.
         */

        System.out.println("-".repeat(20));
        System.out.println("Alan ve Çevre Hesaplama");
        System.out.println("1. Kare");
        System.out.println("2. Daire");
        System.out.printf("Seçiminiz: ");
        Scanner input=new Scanner(System.in);
        int secim= input.nextInt();
        boolean flag=true;
        switch (secim){
            case 1:
                System.out.printf("Kare için kenar uzunluğu giriniz : ");
                int kenar=input.nextInt();
                if (kenar<=0){
                    System.out.println("Kenar uzunluğu değeri 0 veya daha düşük olamaz.Lütfen tekrar deneyiniz.");
                    flag=false;
                    break;
                }
                System.out.printf("Kenar uzunluğu %d olan karenin alanı   = "+kenar*kenar,kenar);
                System.out.println();
                System.out.printf("Kenar uzunluğu %d olan karenin çevresi = "+4*kenar,kenar);break;
            case 2:
                System.out.printf("Daire için yarıçap uzunluğu giriniz : ");
                int yaricap=input.nextInt();
                if (yaricap<=0){
                    System.out.println("Yarıçap uzunluğu değeri 0 veya daha düşük olamaz.Lütfen tekrar deneyiniz.");
                    flag=false;
                    break;
                }
                System.out.printf("Yarıçap uzunluğu %d olan dairenin alanı   = "+Math.PI*Math.pow(yaricap,2),yaricap);
                System.out.println();
                System.out.printf("Yarıçap uzunluğu %d olan dairenin çevresi = "+2*Math.PI*yaricap,yaricap);break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                flag=false;
                break;
        }
    }
}
