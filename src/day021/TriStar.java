package day021;

public class TriStar {
    public static void main(String[] args) {

        // *               Bu şekli yazdıran bir Java programı yazın.
        // **
        // ***
        // ****
        // *****
        // ******
        // *******

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
