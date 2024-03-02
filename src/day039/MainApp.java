package day039;

public class MainApp {
    public static void main(String[] args) {

        String str="        Merhaba     \t\t\n      Kardeş!";
        System.out.println(str.length());
        System.out.println(str);
        System.out.println();
        String trimStr = str.trim();
        System.out.println(trimStr.length());
        System.out.println(trimStr);
        System.out.println();

        String strng="Merhaba kardeş!";
        String substring1 = strng.substring(8);
        System.out.println(substring1);
        String substring2 = strng.substring(8, 14);
        System.out.println(substring2);
        System.out.println(strng.substring(8,strng.length()));
        System.out.println();

        int indexSpace = strng.indexOf(" ");
        System.out.println("Boşluğun index numarası : "+indexSpace+1);
        int indexExc = strng.indexOf("!");
        System.out.println("Ünlemin index numarası : "+indexExc);

        System.out.println(strng.substring(indexSpace+1));
        System.out.println(strng.substring(indexSpace+1,indexExc));

    }
}
