package day031;

public class Kitap {
    private boolean gecerliMi=true;
    private String adi;
    private String yazari;
    private int sayfaAdedi;

    public Kitap(){
    }

    public Kitap(String adi, String yazari, int sayfaAdedi){
        this.adi = adi;
        this.yazari = yazari;
        this.sayfaAdedi = sayfaAdedi;
    }


    public boolean isGecerliMi() {
        return gecerliMi;
    }

    public void setGecerliMi(boolean gecerliMi) {
        this.gecerliMi = gecerliMi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        if (adi!=null&!adi.isEmpty()&!adi.isBlank()) {
            this.adi = adi;
        }else {
            gecerliMi=false;
            System.err.println("Kitap adı boş olamaz.");
        }
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        if (yazari!=null&!yazari.isEmpty()&!yazari.isBlank()) {
            this.yazari = yazari;
        }else {
            gecerliMi=false;
            System.err.println("Yazar adı boş olamaz.");
        }
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi) {
        if (sayfaAdedi>0) {
            this.sayfaAdedi = sayfaAdedi;
        }else {
            gecerliMi=false;
            System.err.println("Sayfa adedi negatif olamaz.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s : %d)",adi,yazari,sayfaAdedi);
    }
}
