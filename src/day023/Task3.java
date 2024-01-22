package day023;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        
        // 10 elemanlı sayılar dizisi oluşturunuz. 0-100 arasından rastgele tamsayılar atayınız.
        // Listeleyip, toplamını ve ortalamasını gösteren bir Java programı yazınız.

        int sayılar[]=new int[10];
        Random rnd=new Random();
        int sum=0;
        double avr=0.0;
        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i] = rnd.nextInt(0,100);
        }
        System.out.print("Sayılar = ");
        for (int i = 0; i < sayılar.length; i++) {
            System.out.print(sayılar[i]+", ");
        }
        for (int i = 0; i < sayılar.length; i++) {
            sum+=sayılar[i];
        }
        avr=sum/10;
        System.out.println();
        System.out.println("Sayıların Toplamı    = "+sum);
        System.out.println("Sayıların Ortalaması = "+avr);
    }
}
