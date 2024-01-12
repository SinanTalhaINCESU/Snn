package day014;

public class MaxNumber {
    public static void main(String[] args) {
        /*
            Atanan 3 sayıyı karşılaştırıp en büyüğünü ekrana yazdıran Java programını yazın.
         */
        int x=1, y=8, z=4;
        if (x>y & x>z){
            System.out.println("En büyük sayı x'dir. X = "+x);
        } else if (y>x & y>z) {
            System.out.println("En büyük sayı y'dir. Y = "+y);
        }else {
            System.out.println("En büyük sayı z'dir. Z = "+z);
        }
    }
}
