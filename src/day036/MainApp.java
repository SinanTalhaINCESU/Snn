package day036;

public class MainApp {
    public static void main(String[] args) {

        String string="Java";
        System.out.println(string);
        string=string.toUpperCase();
        System.out.println(string);


        String str1="Python";
        String str2="Data Science";
        String str3="Python";

        String str4=new String("Java");
        String str5=new String("C++");
        String str6=new String("Data Science");
        String str7=new String("Data Science").intern();
        String str8=new String("Python");

        if (str1==str3){
            System.out.println("str1 ve str3 aynıdır.");
        }else {
            System.out.println("str1 ve str3 farklıdır.");
        }
        if (str1==str8){
            System.out.println("str1 ve str8 aynıdır.");
        }else {
            System.out.println("str1 ve str8 farklıdır.");
        }
        if (str1.equals(str8)){
            System.out.println("str1 ve str8 aynıdır.");
        }else {
            System.out.println("str1 ve str8 farklıdır.");
        }
        if (str2==str6){
            System.out.println("str2 ve str6 aynıdır.");
        }else {
            System.out.println("str2 ve str6 farklıdır.");
        }
        if (str2==str7){
            System.out.println("str2 ve str7 aynıdır.");
        }else {
            System.out.println("str2 ve str7 farklıdır.");
        }
    }
}
