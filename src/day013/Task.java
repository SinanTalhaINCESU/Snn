package day013;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
            Klavyeden userName ve password bilgisi alınacaktır.
            Eğer her iki veri doğru ise "Yönetim sayfasına hoşgeldiniz" mesajı verilecektir.
            Eğer parola yanlış ise "Yanlış parola girdiniz. Lütfen tekrar deneyiniz." mesajı verilecektir.
            Eğer kullanıcı adı yanlış girilmiş ise "Lütfen sistem yöneticisi ile irtibat kurunuz" mesajı verilecektir.
         */

        String userName="sinan";
        String password="java";

        Scanner input=new Scanner(System.in);
        System.out.printf("Kullanıcı adını giriniz = ");
        String username= input.next();

        System.out.printf("Şifre giriniz = ");
        String pasword= input.next();

        if (username.equals("sinan") & pasword.equals("java")){
            System.out.println("Yönetim sayfasına hoşgeldiniz");
        } else if (!pasword.equals("java")) {
            System.out.println("Yanlış parola girdiniz. Lütfen tekrar deneyiniz.");
        } else if (!username.equals("sinan")) {
            System.out.println("Lütfen sistem yöneticisi ile irtibat kurunuz");
        }
    }
}
