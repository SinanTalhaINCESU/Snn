package day032;

import day032.personelpro.Personel;

public class MainApp {
    public static void main(String[] args) {
        Personel per1=new Personel();
        per1.setAdi("Ahmet");
        per1.setSoyadi("Dursun");
        per1.setSicilNo(1);
        per1.setIseGirisYili(1990);
        per1.setMaasi(5000);

        per1.iseBasla();
        System.out.println("-".repeat(20));
        per1.molaVer();
        System.out.println("-".repeat(20));
        per1.paydosYap();
        System.out.println("-".repeat(20));

        if (Personel.maasaZamYap(per1,100)){
            System.out.println("Zam yapıldı.");
        }else {
            System.out.println("Zam yapılamadı.");
        }

        System.out.println("Maaş : "+per1.getMaasi());
    }
}