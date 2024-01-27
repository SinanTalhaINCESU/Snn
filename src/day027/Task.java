package day027;

class Kare {
    // Özellikler
    private int kenar;

    // Constructor Metot
    public Kare(int kenar) {
        this.kenar = kenar;
    }

    // Metotlar
    public int alanHesapla() {
        return kenar * kenar;
    }

    public int cevreHesapla() {
        return 4 * kenar;
    }

    public double kosegenUzunlugu() {
        return kenar * Math.sqrt(2);
    }
}

class Daire {
    // Özellikler
    private int yaricap;

    // Constructor Metot
    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    // Metotlar
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
}

public class Task {
    public static void main(String[] args) {
        // Kare nesnesi oluşturuluyor
        Kare kare = new Kare(7);

        // Daire nesnesi oluşturuluyor
        Daire daire = new Daire(7);

        // Alan ve çevre uzunluğu farklarının mutlak değerleri hesaplanıyor
        double kareDaireAlanFark = Math.abs(kare.alanHesapla() - daire.alanHesapla());
        double kareDaireCevreFark = Math.abs(kare.cevreHesapla() - daire.cevreHesapla());

        // Sonuçlar ekrana yazdırılıyor
        System.out.println("Karenin Alanı: " + kare.alanHesapla());
        System.out.printf("Dairenin Alanı: %5.2f",daire.alanHesapla());
        System.out.printf("\nAlan Farkı: %5.2f",kareDaireAlanFark);
        System.out.println();
        System.out.println("\nKarenin Çevresi: " + kare.cevreHesapla());
        System.out.printf("Dairenin Çevresi: %5.2f",daire.cevreHesapla());
        System.out.printf("\nÇevre Farkı: %5.2f",kareDaireCevreFark);
    }
}