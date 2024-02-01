package day030;

public class Main {
    public static void main(String[] args) {

        Araba a1=new Araba();
        YarisArabasi a2=new YarisArabasi();
        Araba a3=new YarisArabasi();

        a1.ilerle();
        a2.ilerle();
        a3.ilerle();
        System.out.println();
        a2.turbo();
        ((YarisArabasi)a3).turbo();
    }
}
