package day034.polymorphism;

public class Dikdortgen extends Sekil{

    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen() {
    }

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    double alanHesapla() {
        return kisaKenar*uzunKenar;
    }

    @Override
    double cevreHesapla() {
        return 2*(kisaKenar+uzunKenar);
    }
}
