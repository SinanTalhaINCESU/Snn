package day017;

public class Task3 {
    public static void main(String[] args) {
        // Task: 0'dan 100'e kadar olan sayılardanhem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
        // Java programını yazın.

        for (int i = 0; i <= 100; i++) {
            if (i%2==0 & i%5==0){
                System.out.print(i+" - ");
            }
        }
    }
}
