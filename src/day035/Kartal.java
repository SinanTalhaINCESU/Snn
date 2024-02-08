package day035;

public class Kartal extends Hayvan implements Avci,Ucucu,Yuzucu{

    @Override
    public void avlan() {
        System.out.println("Kartal avlanıyor.");
    }

    @Override
    public void uc() {
        System.out.println("Kartal uçuyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Kartal yüzüyor.");
    }
}
