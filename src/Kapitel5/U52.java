package Kapitel5;

import javax.swing.*;

public class U52 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv ett tal"));
        int summa = 0;
        int k = 1;
        int tal = 0;

        while (tal <= n) {
            summa = summa + k;
            k = 1/(k + tal);
            tal = tal + 1;

        }
        JOptionPane.showMessageDialog(null, "Summan är: " + summa);
    }
}
