package day035;

public class KopekBaligi extends Hayvan implements Avci,Yuzucu{

    @Override
    public void avlan() {
        System.out.println("Köpek Balığı avlanıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Köpek Balığı yüzüyor.");
    }
}
