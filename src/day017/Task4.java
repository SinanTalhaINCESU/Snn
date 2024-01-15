package day017;

public class Task4 {
    public static void main(String[] args) {
        // TASK: 1 ile 100 arasındaki (100 hariç) tek sayıların ve çift sayıların
        // toplamlarını ayrı ayrı bulan Java programını yazın.

        int tek=0;
        int cift=0;
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                tek=tek+i;
            }
            if (i%2!=0){
                cift=cift+i;
            }
        }
        System.out.println("Çift sayıların toplamı = "+tek);
        System.out.println("Tek sayıların toplamı = "+cift);
    }
}
