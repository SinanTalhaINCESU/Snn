package day025.hayvanlar;

public class Aslan {

    public String tur;
    public String cins;
    public String renk;
    public double boy;
    public double kilo;

    public void bilgiGoster(){
        System.out.printf("%s aslanı, cinsi %s olup, %s rengindedir. Boyu %5.2f metre, kilosu %5.2f kg'dir.",tur,cins,renk,boy,kilo);
    }
}
