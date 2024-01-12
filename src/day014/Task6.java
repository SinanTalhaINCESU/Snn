package day014;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        /*
        Kullanıcı tarafından girilen 3 adet sayıdan en büyüğünü ekrana yazdıran Java programını yazın.
        */

        Scanner input=new Scanner(System.in);
        System.out.printf("İlk sayıyı giriniz = ");
        int ilkSayi= input.nextInt();

        System.out.printf("İkinci sayıyı giriniz = ");
        int ikinciSayi= input.nextInt();

        System.out.printf("Üçüncü sayıyı giriniz = ");
        int üçüncüSayi= input.nextInt();

        int max=ilkSayi;
        if (ilkSayi<ikinciSayi & ikinciSayi>üçüncüSayi){
            max=ikinciSayi;
            System.out.println("En büyük sayı "+ikinciSayi+"'dir.");
        } else if (ikinciSayi<üçüncüSayi & üçüncüSayi>ilkSayi) {
            max=üçüncüSayi;
            System.out.println("En büyük sayı "+üçüncüSayi+"'dır.");
        } else{
            System.out.println("En büyük sayı "+ilkSayi+"'dir.");
        }
    }
}
