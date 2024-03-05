package day040;

public class MainApp {
    public static void main(String[] args) {

        //TASK: ad ve soyad usulüne uygun şekilde birleştirilip, büyük karakterli olarak yazdırılacaktır.
        String str1="Ahmet";
        String str2="Dursun";
        String isim=str1
                        .concat(" ")
                        .concat(str2)
                        .toUpperCase();

        System.out.println(isim);
        System.out.println();
        System.out.println((str1+" "+str2).toUpperCase());
        System.out.println();
        System.out.printf("%s %s\n".toUpperCase(),str1,str2);

        String str=String.format("%s %s",str1,str2).toUpperCase();
        System.out.println(str);
        System.out.println(str.toLowerCase());
    }
}
