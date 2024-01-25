package day025;

public class Program {

    public static void main(String[] args) {
        Kare kare1=new Kare();
        kare1.kenar=7;
        kare1.bilgiGoster();

        Kare kare2=new Kare();
        kare2.kenar=5;
        kare2.bilgiGoster();

        int toplamAlan = kare1.alanHesapla()  + kare2.alanHesapla();
        int toplamCevre= kare1.cevreHesapla() + kare2.cevreHesapla();

        System.out.println(toplamAlan);
        System.out.println(toplamCevre);
    }
}
