package day023;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // 5 elemanlı bir arabalar dizisi oluşturunuz. Kullanıcıdan aradığı arabanın ismini isteyiniz.
        // Bulununca aradığınız araç bulundu veya araç bulunamadı mesajı veren Java programı yazınız.

        String arabalar[] = {"McLaren", "Bugatti", "Mustang", "Supra", "Bentley"};
        System.out.print("Lütfen aradığınız arabanın ismini yazın: ");
        String secim = new Scanner(System.in).next();

        boolean aracBulundu = false;

        for (int i = 0; i < arabalar.length; i++) {
            if (secim.equalsIgnoreCase(arabalar[i])) {
                System.out.println("Aradığınız araç bulunmuştur: " + arabalar[i]);
                aracBulundu = true;
                break;
            }
        }

        if (!aracBulundu) {
            System.out.println("Aradığınız araç bulunamamıştır.");
        }
    }
}
