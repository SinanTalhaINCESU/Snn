package day027;

public class Program {
    public static void main(String[] args) {

        Object obj=new Object();

        Hayvan hy1=new Hayvan();

        hy1.yasiKaydet(3);
        //hy1.yas=3;
        hy1.ismiKaydet("Hayvan1");
        //hy1.isim="Hayvan1";
        hy1.agirligiKaydet(11.0);
        //hy1.agirlik=11;

        hy1.beslen();
        hy1.uyu();

        System.out.printf("%s --> %d , %5.2f",hy1.ismiGetir(),hy1.yasiGetir(),hy1.agirligiGetir());

        Aslan a1=new Aslan();
    }
}
