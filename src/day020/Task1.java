package day020;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String[] aylar={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        System.out.print("Kaçıncı ayı seçtiniz ? [1-12]: ");
        Scanner input=new Scanner(System.in);
        int secim=input.nextInt();
        if(secim>0 & secim<=12) {
            System.out.printf("Seçilen ay %s", aylar[secim - 1]);
        }else {
            System.out.println("Yanlış seçim yaptınız.");
        }
    }
}
