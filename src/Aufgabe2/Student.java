package Aufgabe2;

public class Student extends Mensch {
    long matrikelnummer;
    String studiengang;

    public Student(String vorname, String nachname, int alter, long matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public void Status() {
        System.out.println("Dies ist ein Student mit den Daten " + vorname + " " + nachname + " " + alter + " " + matrikelnummer + " " + studiengang);
    }
}
