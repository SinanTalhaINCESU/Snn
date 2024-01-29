package day028;

public class Sekil {
    public int[] getKenarlar() {
        return kenarlar;
    }

    public void setKenarlar(int[] kenarlar) {
        this.kenarlar = kenarlar;
    }

    public int[] getKoseler() {
        return koseler;
    }

    public void setKoseler(int[] koseler) {
        this.koseler = koseler;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        if (renk!=null) {
            this.renk = renk;
        }
    }

    private int kenarlar[];
    private int koseler[];
    private String renk;

    public int alanHesapla(){
        return 0;
    }

    public int cevreHesapla(){
        return 0;
    }

    public int icAcilarToplami(){
        return 0;
    }
}
