package day011;

import java.util.Scanner;

public class RelatOrnekler {
    public static void main(String[] args) {

        /*
            Klavyeden yaşını öğrendiğiniz bir kişiye yetişkin olup olmadığını söyleyen
            Java programını yazınız.
         */

        Scanner input=new Scanner(System.in);
        System.out.printf("Yaşınızı giriniz = ");
        int yas=input.nextInt();

        if (yas<18){
            System.out.println("Yetişkin değilsiniz.");
        }
        else {
            System.out.println("Yetişkinsiniz.");
        }
    }
}
