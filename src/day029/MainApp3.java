package day029;

import java.util.Random;
import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç adet hayvan oluşturulacak? : ");
        int hayvanSayisi=input.nextInt();
        Hayvan[]hayvanlar=new Hayvan[hayvanSayisi];
        Random rnd=new Random();
        for (int i = 0; i < hayvanlar.length; i++) {
            hayvanlar[i]=rnd.nextInt(100,1000)>500?new Kedi():new Koyun();
            hayvanlar[i].beslen();

        }
    }
}
