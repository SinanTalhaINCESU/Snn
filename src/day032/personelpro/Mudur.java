package day032.personelpro;

public class Mudur extends Personel{

    @Override
    public void iseBasla() {
        System.out.println("Müdür işe başlıyor.");
    }

    @Override
    public void molaVer() {
        System.out.println("Müdür mola veriyor.");
    }

    @Override
    public void paydosYap() {
        System.out.println("Müdür paydos yapıyor.");
    }

    public void showInfo(){
        System.out.println("Naber Müdür ?");
    }
}
