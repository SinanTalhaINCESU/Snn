package day029;

public class Kedi extends Hayvan{

    public Kedi(){
        System.out.println("Kedi nesenesi oluşturuldu.");
    }

    public void avlan(){
        System.out.println("Kedi avlanıyor.");
    }

    @Override
    public void beslen() {
        System.out.println("Kedi et ile besleniyor.");
    }
}
