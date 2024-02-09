package day035.Pencere;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame pencere=new JFrame("Geometrik Şekiller V1.0");
        pencere.setSize(800,600);

        pencere.setLayout(null);

        JButton button=new JButton("Tamam");
        button.setSize(100,30);
        button.setLocation(10,20);
        pencere.add(button);

        Kare kare1=new Kare(200);
        kare1.setLocation(120,20);
        pencere.add(kare1);

        pencere.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pencere.setVisible(true);

    }
}
