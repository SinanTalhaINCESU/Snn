package day034.polymorphism;

public class MainApp {
    public static void main(String[] args) {

        Kare kare=new Kare(9);
        System.out.println("Karenin Alanı   = "+kare.alanHesapla());
        System.out.println("Karenin Çevresi = "+kare.cevreHesapla());

        Sekil sekil=new Daire(7);
        Sekil[] sekiller=new Sekil[5];
        sekiller[0]=new Daire(5);
        sekiller[1]=new Kare(6);
        sekiller[2]=new Dikdortgen(8,12);
        sekiller[3]=new Daire(9);
        sekiller[4]=new Sekil() {
            @Override
            double alanHesapla() {
                return 100;
            }

            @Override
            double cevreHesapla() {
                return 50;
            }
        };

        for (Sekil s:sekiller) {
            System.out.println("Alan  : "+s.alanHesapla());
            System.out.println("Çevre : "+s.cevreHesapla());
            System.out.println();
        }
    }
}
