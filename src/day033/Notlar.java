package day033;

public class Notlar {
    public static void main(String[] args) {

        int[] vizeNotlari={81,56,92,38,53};
        int[] finalNotlari={95,54,74,93,69};

        int[][] notlar={
                {81,95},
                {56,54},
                {92,74},
                {38,93},
                {53,69}
        };
        String[] isimler={"Ahmet","Ayşe","Şengül","Orhan","Betül"};

        System.out.println("İsim\tVize\tFinal");

        for (int i = 0; i < notlar.length; i++) {
            System.out.print(isimler[i]+"\t");
            for (int j = 0; j < 2; j++) {
                System.out.print(notlar[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
