package day035;

public class Kirlangic extends Hayvan implements Avci,Ucucu{

    @Override
    public void avlan() {
        System.out.println("Kırlangıç avlanıyor.");
    }

    @Override
    public void uc() {
        System.out.println("Kırlangıç uçuyor.");
    }
}
