package day015;

public class SwitchKullanimi {
    public static void main(String[] args) {

        int secim=1;

        switch (secim){

            default:
                System.out.println("Yanlış seçim yaptınız.");break;
            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("Salı");
            case 3:
                System.out.println("Çarşamba");
            case 4:
                System.out.println("Perşembe");
            case 5:
                System.out.println("Cuma");
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;

        }
        //break imleci buraya atar
        System.out.println("Switch'ten çıkıldı.");
    }
}
