package Aufgabe2;

public class Aufruf {
    public static void main (String[] args){
        Mensch hias = new Mensch("Matthias", "Oberleitner", 21);
        hias.Status();
        hias = new Student("Matthias", "Oberleitner", 21, 1810653024, "Web18");
        hias.Status();
    }
}
