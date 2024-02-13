package day039;

import javax.swing.*;

public class MainApp2 {

    /*
        Verilen ismin (ad soyad) sadece baş harflerini geri döndüren bir metot tasarlayın.
        Kullanıcıdan bir isim alıp ekranda gösteriniz.
     */

    public static void main(String[] args) {

        String isim= JOptionPane.showInputDialog("Lütfen İsminizi Giriniz");
        System.out.println("İsminizin baş harfleri : "+findInitialletters(isim));
    }

    public static String findInitialletters(String isim){
        int indexSpace=isim.indexOf(" ");
        String first=""+isim.charAt(0);
        String second=""+isim.charAt(indexSpace+1);

        return first+second;
    }
}
