package day017;

public class Task1 {
    public static void main(String[] args) {
        // Task: 0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazın.

        for (int i = 0; i <= 20; i+=2) {
            System.out.print(i);
            if (i<20){
                System.out.print("-");
            }
        }
    }
}
