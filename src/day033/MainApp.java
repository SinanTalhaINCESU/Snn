package day033;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        int[]sayilar={1,3,5,7};
        System.out.println(Arrays.toString(sayilar));

        Gezgin gezgin=new Gezgin();
        System.out.println(gezgin.addYol(10));
        System.out.println(gezgin.addYol(20));
        System.out.println(gezgin.addYol(70));
    }
}
