package day023;

import java.util.Random;
import java.util.Scanner;

public class CarTask {
    public static void main(String[] args) {

        Random fyt= new Random();
        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d. %s\n",i+1,cars[i]);
        }
        System.out.println("Lütfen bir araba seçiniz.");
        System.out.print("Seçiminiz : ");
        int secim=new Scanner(System.in).nextInt();
        int fiyat=0;
        switch (secim){
            case 1:
            case 2:
            case 3: fiyat = fyt.nextInt(20000,40000);break;
            case 4:
            case 5: fiyat = fyt.nextInt(50000,80000);break;
            case 6:
            case 7: fiyat = fyt.nextInt(100000,150000);break;

        }
        if (secim>=1 & secim<=7) {
            System.out.printf("Seçiminiz %s, fiyatı %d. İyi günlerde kullanın.\n", cars[secim - 1],fiyat);
        }else {
            System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");
        }
    }
}
