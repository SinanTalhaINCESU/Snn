package day016;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Kullanıcıdan bir geometrik şeklin iç açı (3 adet) değerlerini alınız.
        //Verilen açılara göre; "Bu şekil bir üçgendir", "Bu şekil bir üçgen değildir" mesajı veren
        //Java programını yazın.            Not: Üçgenin iç açıları toplamı 180'dir.

        Scanner input=new Scanner(System.in);
        System.out.printf("İlk açı değerini giriniz = ");
        int aci1= input.nextInt();
        if (aci1<=0) {
            System.out.println("Açı değeri 0 veya daha düşük olamaz.Lütfen tekrar deneyiniz.");
            return;
        }
        System.out.printf("İkinci açı değerini giriniz = ");
        int aci2=input.nextInt();
        if (aci2<=0) {
            System.out.println("Açı değeri 0 veya daha düşük olamaz.Lütfen tekrar deneyiniz.");
            return;
        }
        System.out.printf("Üçüncü açı değerini giriniz = ");
        int aci3=input.nextInt();
        if (aci3<=0) {
            System.out.println("Açı değeri 0 veya daha düşük olamaz.Lütfen tekrar deneyiniz.");
            return;
        }

        if (aci1+aci2+aci3==180){
            System.out.println("Bu şekil bir üçgendir.");
        }else {
            System.out.println("Bu şekil bir üçgen değildir.");
        }


    }
}
