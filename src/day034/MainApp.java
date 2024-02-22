package day034;

public class MainApp {
    public static void main(String[] args) {


        String[][] zaman={
                {"Pzt","Sal","Çar","Per","Cum","Cts","Paz"},
                {"Oca","Şub","Mar","Nis","May","Haz","Tem","Ağu","Eyl","Eki","Kas","Ara"},
                {"İlk","Yaz","Son","Kış"}
        };

        System.out.println("Birinci Eleman : "+zaman[0].length+" elemanlıdır.");
        System.out.println("İkinci Eleman  : "+zaman[1].length+" elemanlıdır.");
        System.out.println("Üçüncü Eleman  : "+zaman[2].length+" elemanlıdır.");

        int toplamElemanSayisi=0;
        for (int i = 0; i < zaman.length; i++) {
            toplamElemanSayisi+=zaman[i].length;
        }
        System.out.println("Toplam Eleman Sayısı : "+toplamElemanSayisi);
        System.out.println("-".repeat(30));
        for (int i = 0; i < zaman.length; i++) {
            for (int j = 0; j < zaman[i].length; j++) {
                System.out.print(zaman[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
