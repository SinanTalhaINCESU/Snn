package day015;

public class Task {
    public static void main(String[] args) {

        //TODO: İki tamsayı değişkenine değerleri assign ediniz.
        /*
            Önce bunları isimleri ve değerleriyle birlikte ekrana yazdırınız.
            Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.
         */

        int x=5, y=7;
        System.out.printf("x'in değeri = %d\n",x);
        System.out.printf("y'in değeri = %d\n",y);

        int z=x;
        x=y;
        y=z;

        System.out.printf("x'in değeri = %d\n",x);
        System.out.printf("y'in değeri = %d\n",y);
    }
}
