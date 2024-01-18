package day019;

public class Task1 {
    public static void main(String[] args) {

        //TODO: On iki öğrencinin notlarını bir tamsayı dizisi değişkeninde saklayın. Bu notların ortalamasını bulan bir Java programı yazınız.
        //TODO: Notlar: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45

        int[] notlar = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        double toplam=0.0;
        for (int i = 0; i < notlar.length; i++) {
            toplam=toplam+notlar[i];
        }
        System.out.printf("Not Ortalaması = %5.2f",toplam/notlar.length);
    }
}
