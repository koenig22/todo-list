package de.dhbw;

public class Programm {

    public static void main(String[] args) {
        System.out.println("Willkommen bei der ToDo Liste");

        Datum date1 = new Datum("12","10","2021");
        Aufgabe aufgabe1 = new Aufgabe("Hausaufgaben machen",date1);

        Benutzer benutzer1 = new Benutzer("JN");
        Liste liste = new Liste("Liste1", benutzer1);

        liste.addAufgabe(aufgabe1);
        benutzer1.addListe(liste);

    }
}
