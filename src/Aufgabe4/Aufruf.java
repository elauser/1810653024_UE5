package Aufgabe4;

import javax.swing.*;

public class Aufruf {
    public static void main(String[]args){
        String new1 = JOptionPane.showInputDialog(null,"Geben Sie etwas ein");
        String new2 = JOptionPane.showInputDialog(null,"Geben Sie etwas ein");
        String new3 = JOptionPane.showInputDialog(null,"Geben Sie etwas ein");

        if(new1.equals(new2) && new2.equals(new3)) System.out.println("Alle Eingaben sind ident");
        else if(new1.equals(new2)) System.out.println("Eingabe 1 = Eigabe 2");
        else if(new2.equals(new3)) System.out.println("Eingabe 2 = Eigabe 3");
        else if(new1.equals(new3)) System.out.println("Eingabe 1 = Eingabe 3");
        else System.out.println("Keine der Eingaben ist ident");
    }
}
