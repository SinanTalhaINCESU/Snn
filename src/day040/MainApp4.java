package day040;

public class MainApp4 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Merhaba!");

        sb.append("Nasılsın?");
        sb.insert(8,"Kardeş.");

        System.out.println(sb);
        System.out.println(sb.delete(8,14));
        System.out.println(sb.reverse());

        System.out.println(new StringBuilder("ey edip adanada pide yE").reverse());

        System.out.println(
                new StringBuilder()
                        .append("Merhaba")
                        .insert(0,"Ahmet")
                        .reverse()
        );
    }
}

