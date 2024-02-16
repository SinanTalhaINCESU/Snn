package day040;

public class MainApp2 {
    public static void main(String[] args) {

        String str="Ben bir garip Keloğlanım.";

        boolean kelVarMi=str.toLowerCase().contains("KEL".toLowerCase());
        if (kelVarMi){
            System.out.println("Kel var.");
        }

        String isim="Mehmet Ali Erbil";
        String replace = isim.replace('e','i');
        System.out.println(replace);
        String replace1 = isim.replace("Erbil","Birand");
        System.out.println(replace1);
        System.out.println(isim);


        String strng="";
        System.out.println(strng.length());
        if (strng.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("Empty değil");
        }

        if (strng.isBlank()){
            System.out.println("Blank");
        }else {
            System.out.println("Blank değil");
        }
    }
}
