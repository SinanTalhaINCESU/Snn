package day010;

public class Metotlar3 {
    public static void main(String[] args) {

        int cevre=cevreHesapla(3);
        System.out.println(cevre);

    }

    public static int cevreHesapla(int kenar){
        int c=4*kenar;
        return c;
    }
}
