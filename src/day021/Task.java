package day021;

public class Task {
    public static void main(String[] args) {

        //String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe","Salih",
        // "Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        //
        //Yukarıdaki dizi verildiğine göre;
        //Adı Bölümü
        //Ahmet Fizik
        //
        //biçiminde ekran çıktısı veren bir Java programı yazınız.

        String[] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz",
                "Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        String arananKisi="Ahmet";
        String arananDers="Fizik";
        boolean bulundu = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(arananKisi) & data[i+1].equals(arananDers)){
                System.out.println("Adı     Bölümü");
                System.out.println(data[i]+"   "+data[i+1]);
                bulundu = true; break;
            }
        }
        if (!bulundu){
            System.out.println("Aranan kişi ve ders bulunamadı.");
        }
    }
}
