package day021;

public class ForEach {
    public static void main(String[] args) {
        String [] isimler={"Fatma","Yusuf","Fatih","Zeynep"};
        for (String isim:isimler) {
            System.out.println(isim);
        }

        double[] numbers={1.2,3.5,5.3};
        double t=0.0;
        for (double n:numbers) {
            t+=n;
        }
        System.out.println("Toplam = "+t);
    }
}
