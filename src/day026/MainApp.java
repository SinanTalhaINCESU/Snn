package day026;

public class MainApp {
    public static void main(String[] args) {

        int toplam=Islem.topla(3,7);
        System.out.println("Toplam = "+toplam);
        System.out.println("Toplam = "+Islem.topla(2.4,7.7)+"\n");

        System.out.println("Fark   = "+Islem.cikar(8,5));
        System.out.println("Çarpım = "+Islem.carp(4,5));
        System.out.println("Bölüm  = "+Islem.bol(10,2));

    }
}
