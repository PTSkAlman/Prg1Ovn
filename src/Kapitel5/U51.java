package Kapitel5;

import javax.swing.*;

public class U51 {
    public static void main(String[] args) {
        int tal = Integer.parseInt(JOptionPane.showInputDialog("Skriv ett tal"));
        int k = 1;
        int summa = 0;
        int n = 1;

        while (k <= tal) {
            summa = summa+n;
            k = k+1;
            n = k * k;

        }
        JOptionPane.showMessageDialog(null, "Summan är: " + summa);
    }
}
