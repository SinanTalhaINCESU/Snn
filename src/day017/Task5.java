package day017;

public class Task5 {
    public static void main(String[] args) {
        // TASK: 1'den 10'a kadar olan sayıları ve karşılarına karelerini yazdıran Java programını yazın.

        System.out.println("SAYILAR         KARELERİ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"                "+i*i);
        }
    }
}
