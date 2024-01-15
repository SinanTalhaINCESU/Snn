package day016;

public class Loops3 {
    public static void main(String[] args) {
        //TODO: 1'den 10'a kadar olan sayıların ortalamasını bulan Java programını yazın.

        double toplam=0.0;
        for (int i = 0; i <= 10; i++) {
            toplam=toplam+i;
        }
        System.out.println("Sayıların ortalaması = "+toplam/10);
    }
}
