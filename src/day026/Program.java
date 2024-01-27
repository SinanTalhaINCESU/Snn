package day026;

public class Program {
    public static void main(String[] args) {

        DortIslem islem1=new DortIslem(5,7);
        System.out.println("Sayıların Toplamı = "+islem1.topla());
        System.out.println("Sayıların Çarpımı = "+islem1.carp());

        System.out.println("-".repeat(22));

        DortIslem islem2=new DortIslem(4,6);
        System.out.println("Sayıların Toplamı = "+islem2.topla());
        System.out.println("Sayıların Çarpımı = "+islem2.carp());
    }
}
