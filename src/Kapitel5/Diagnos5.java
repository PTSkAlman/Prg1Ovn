package Kapitel5;

import javax.swing.*;

public class Diagnos5 {
    public static void main(String[] args) {
        //while (true) {
            //Multiplikationstabellen med While loop
        /*
        int heltal = Integer.parseInt(JOptionPane.showInputDialog("Skriv ett heltal"));
        int i = 0;
        int svar = 0;

        while (i < 10) {
            i++;
            svar = heltal*i;
            System.out.println(i + "*" + heltal + "=" + svar);
        */

            //Multiplilationstabellen med For loop
        /*
        int heltal = Integer.parseInt(JOptionPane.showInputDialog("Skriv ett heltal"));
        int svar = 0;
        int i = 0;

        for (i = 0 ; i <= 10 ; i++) {
            svar = i*heltal;
            System.out.println(i + "*" + heltal + "=" + svar);
        }
        */

            //Multiplikationstabellen med Do While loop
            int heltal = Integer.parseInt(JOptionPane.showInputDialog("Skriv ett heltal"));
            int i = 0;
            int svar = 0;
            do {
                i++;
                svar = i * heltal;
                System.out.println(i + "*" + heltal + "=" + svar);
            } while (i < 10);
            /*
            JOptionPane.showConfirmDialog("Vill du köra igen?", JOptionPane.YES_NO_OPTION);
            int knappnr;
            if (knappnr == 1) {
                System.exit(0);
             */
            //}
        //}
    }
}
