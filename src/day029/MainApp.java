package day029;

public class MainApp {
    public static void main(String[] args) {
        Hayvan h1=new Hayvan();
        Kedi k1=new Kedi();
        Koyun ko1=new Koyun();

        h1.beslen();
        k1.beslen();
        k1.avlan();
        ko1.beslen();
    }
}
