package day035;

public class MainApp {
    public static void main(String[] args) {

        Kartal k1=new Kartal();
        Ucucu ucucu1=new Kirlangic();
        Avci avci1=new KopekBaligi();

        Ucucu[] ucanlar=new Ucucu[3];
        ucanlar[0]=new Kirlangic();
        ucanlar[1]=new Kartal();
        ucanlar[2]=new Kirlangic();

        for (Ucucu u:ucanlar) {
            u.uc();
        }
    }
}
