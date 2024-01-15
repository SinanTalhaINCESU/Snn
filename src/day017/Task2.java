package day017;

public class Task2 {
    public static void main(String[] args) {
        // Task: 0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazın.
        int toplam=0;
        for (int i = 0; i < 20; i++) {
            if (i%2!=0){
                toplam=toplam+i;
            }
        }
        System.out.println("Sonuç = "+toplam);
    }
}
