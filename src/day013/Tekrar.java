package day013;

public class Tekrar {
    public static void main(String[] args) {

        String burakIsim="Burak Yılmaz";
        int yas=38;

        String mesaj;
        mesaj=String.format("%s eski bir futbolcudur. Şu an %d yaşındadır.",burakIsim,yas);
        System.out.println(mesaj);
    }
}
