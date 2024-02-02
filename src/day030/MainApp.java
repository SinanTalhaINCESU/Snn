package day030;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Kitap kitap=new Kitap();
        System.out.println("Kitap Giriş Ekranı");
        Scanner input=new Scanner(System.in);
        System.out.printf("Kitabın Adı : ");
        kitap.setAdi(input.nextLine());
        System.out.printf("Kitabın Yazarı : ");
        kitap.setYazari(input.nextLine());
        System.out.printf("Sayfa Adedi : ");
        kitap.setSayfaAdedi(input.nextInt());


        kaydet(kitap);
    }
    public static void kaydet(Kitap kitap){
        if (kitap.isGecerliMi()) {
            System.out.println(kitap + " veri tabanına kaydedildi.");
        }else {
            System.out.println("Kayıt işlemi başarısız.");
        }
    }
}
