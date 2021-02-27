package de.dhbw;

import java.util.ArrayList;
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        System.out.println("Willkommen bei der ToDo Liste");

        //Benutzer Aufgabe und Liste erstellen
        Benutzer benutzer1 = new Benutzer("JN");

        Aufgabe aufgabe1 = new Aufgabe();
        aufgabe1.setDescription("Hausaufgaben machen");
        aufgabe1.setTodoUntil(new Datum("12", "10", "2021"));

        Aufgabe aufgabe2 = new Aufgabe();
        aufgabe2.setDescription("Joggen gehen");
        aufgabe2.setTodoUntil(new Datum("1", "12", "2021"));

        Aufgabe aufgabe3 = new Aufgabe();
        aufgabe3.setDescription("Buch lesen");
        aufgabe3.setTodoUntil(new Datum("14", "2", "2021"));

        Liste liste = new Liste("Liste1");
        Liste liste2 = new Liste("Liste2");

        //Liste dem Benutzer zuweisen
        benutzer1.addListe(liste);
        benutzer1.addListe(liste2);

        //hinzufügen von Aufgabe zur Liste
        liste.addAufgabe(aufgabe1);
        liste.addAufgabe(aufgabe2);
        liste2.addAufgabe(aufgabe3);

        System.out.println("Der Benutzer " + benutzer1.getName()+ " hat folgende Listen: "+ benutzer1.getListe());
        System.out.println("Welche Liste möchtest du dir anschauen? (zBsp.: '1' für '"+benutzer1.getListe().get(0)+ "')");

        Scanner input = new Scanner(System.in);
        int wahl = input.nextInt();

        //Liste ausgeben lassen
        for (int i = 0; i < benutzer1.getListe().get(wahl-1).getTasks().size(); i++) {
            System.out.print(i+1 +". ");
            System.out.println(benutzer1.getListe().get(wahl-1).getTasks().get(i));
        }
    }

}

