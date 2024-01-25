package day025.hayvanlar;

public class Task {
    public static void main(String[] args) {

        Aslan aslan1=new Aslan();
        aslan1.tur="Afrika Aslanı";
        aslan1.cins="erkek";
        aslan1.renk="koyu kahve";
        aslan1.boy=2.50;
        aslan1.kilo=250;

        Aslan aslan2=new Aslan();
        aslan2.tur="Asya Aslanı";
        aslan2.cins="dişi";
        aslan2.renk="altın";
        aslan2.boy=2.20;
        aslan2.kilo=220;

        aslan1.bilgiGoster();
        System.out.println();
        aslan2.bilgiGoster();
    }
}
