package Aufgabe1;

public abstract class Sauugetier {
    String name;
    int alter;
    String geschlecht;

    public Sauugetier(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    public abstract String printAll();

}
