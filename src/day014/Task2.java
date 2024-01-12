package day014;

public class Task2 {
    public static void main(String[] args) {

        // Saat 40'tan büyükse, ödeme oranını 1,5 ile çarpan bir if ifadesi yazın.

        int saat=45;
        double odemeOrani=5.0;

        if (saat>40){
            odemeOrani *=1.5;
        }

        System.out.println(odemeOrani);
    }
}
