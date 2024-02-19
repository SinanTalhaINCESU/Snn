package day038;

public class MainApp {
    public static void main(String[] args) {

        String s = String.valueOf(5);
        System.out.println(s);

        String isim="Ahmet Dursun";
        if (isim.equalsIgnoreCase("ahmet dursun")){
            System.out.println("Aynıdır.");
        }


        String str="Bu bir deneme mesajıdır.";
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        String strng="Merhaba";
        for (int i = 0; i < strng.length(); i++) {
            System.out.println(strng.charAt(i));
        }
        System.out.println();
        //TODO: ey edip adanada pide ye
        // metnini tersten ekrana yazdıran java programını yazın.

        String str1="Ey edip adanada pide ye";
        for (int i = str1.length()-1; i >=0 ; i--) {
            System.out.print(str1.charAt(i));
        }
    }
}
