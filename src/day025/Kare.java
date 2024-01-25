package day025;

public class Kare {
    public int kenar;

    public int alanHesapla(){
        return kenar*kenar;
    }

    public int cevreHesapla(){
        return 4*kenar;
    }

    public void bilgiGoster(){
        System.out.printf("Alan : %d\n",alanHesapla());
        System.out.printf("Cevre: %d\n",cevreHesapla());
    }
}
