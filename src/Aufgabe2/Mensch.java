package Aufgabe2;

public class Mensch {
    String vorname;
    String nachname;
    int alter;

    public Mensch() {
    }

    public Mensch(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    public void Status(){
        System.out.println("Dies ist ein Mensch mit den Daten " + vorname + " " + nachname + " " + alter);
    }
}
