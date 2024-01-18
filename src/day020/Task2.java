package day020;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Gün isimlerinden ibaret EN-TR sözlük hazırlayınız. Türkçe arama yapılmış ise İngilizcesini,
        // İngilizce arama yapılmış ise Türkçesini ekrana yazdırınız.

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        System.out.println("Lütfen bir gün giriniz. Gün Türkçe ve İngilizce olabilir.");
        System.out.print("Gün/Day : ");
        String gun=new Scanner(System.in).nextLine();
        for (int i = 0; i < days.length; i++) {
            if (gun.equalsIgnoreCase(days[i])){
                System.out.println(gunler[i]);
                break;
            } else if (gun.equalsIgnoreCase(gunler[i])) {
                System.out.println(days[i]);
                break;
            }
        }
    }
}
