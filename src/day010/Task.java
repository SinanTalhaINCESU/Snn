package day010;

public class Task {
    public static void main(String[] args) {

        /*
            Kenar uzunluğu verilen bir karenin alan hesaplaması yapılacaktır. Bunun için karenin alanını geriye
            döndüren bir metot tasarlayınız. Daha sonra bu metodu main metodu içerisinden çağırarak
            iki farklı karenin alanlarını toplayınız. Metot ismi alanHesapla olacaktır.
         */

        int alan1=alanHesapla(4);
        int alan2=alanHesapla(5);
        int alanlarToplami=(alan1+alan2);
        System.out.println(alanlarToplami);

    }

    public static int alanHesapla(int kenar){
        int a=kenar*kenar;
        return a;
    }
}
