package day016;

public class Loops2 {
    public static void main(String[] args) {
        //TODO: 1'den 10'a kadar olan sayıların toplamını bulan Java programını yazın.

        int toplam=0;
        for (int i = 0; i <= 10; i++) {
            toplam=toplam+i;
        }
        System.out.println("Toplam = "+toplam);
    }
}
