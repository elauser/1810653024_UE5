package Aufgabe1;

public class Mensch extends Sauugetier {
    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }

    public String printAll(){
        return (this.name + "#" + this.alter + "#" + this.geschlecht);
    }
}
