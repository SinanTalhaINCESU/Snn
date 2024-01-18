package day020;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        //TODO: Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        //TODO: En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

        Scanner input=new Scanner(System.in);
        int[] numbers= new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1)+". sayıyı giriniz = ");
            numbers[i]=input.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }

            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("Dizinin en küçük sayısı = "+min);
        System.out.println("Dizinin en büyük sayısı = "+max);
    }
}
