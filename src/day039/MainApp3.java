package day039;

import javax.swing.*;

public class MainApp3 {
    public static void main(String[] args) {

        /*
            Verilen ismin baş harflerini tutan, fakat geri kalan harflerin yerine asteriks(*) karakteri
            koyan ve metni geriye döndüren bir metot yazın. Metodun ismi hideName olacaktır.
            İsim klavyeden alınıp, ekranda örnekteki gibi gösterim yapılacaktır.
            Örnek: Ahmet Dursun     A**** D*****
         */
        String isim= JOptionPane.showInputDialog(null,"İsminizi Giriniz:","İsim Gizleme",JOptionPane.PLAIN_MESSAGE);
        System.out.println(hideNames(isim));
    }

    public static String hideNames(String name){
        int indexSpace=name.indexOf(" ");
        String tmp="";
        for (int i = 0; i < name.length(); i++) {
            if (i==0){
                tmp+=name.charAt(i);
            } else if (i==indexSpace+1) {
                tmp+=name.charAt(indexSpace+1);
            } else if (i==indexSpace) {
                tmp+=" ";
            }else {
                tmp+="*";
            }
        }
        return tmp;
    }
}
