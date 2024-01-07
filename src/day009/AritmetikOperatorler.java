package day009;

import java.util.Scanner;

public class AritmetikOperatorler {
    public static void main(String[] args) {

        //TASK: x,y ve z değişkenlerini tanımla. Sırasıyla 12,10 ve x+y atamaları yap.

        int x=12, y=10, z=x+y;

        System.out.println(z);


        Scanner input=new Scanner(System.in);
        System.out.print("İsminiz : ");
        String isim=input.next();
        System.out.println("Merhaba "+isim);
    }
}
