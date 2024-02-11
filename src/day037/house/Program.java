package day037.house;

public class Program {
    public static void main(String[] args) {

        House h1=new House();
        h1.heat();
        h1.runCoolingSystem();
        System.out.println();
        House h2=new House(3,2,"Gas");
        h2.setCooling(true);
        h2.heat();
        h2.runCoolingSystem();
    }
}
