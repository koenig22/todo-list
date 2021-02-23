package de.dhbw;

import java.util.ArrayList;

public class Liste {
    private String name;
    private Benutzer owner;
    private ArrayList<Aufgabe> tasks = new ArrayList<Aufgabe>();

    Liste (String name, Benutzer owner, ArrayList<Aufgabe> tasks) {
        this.name = name;
        this.owner = owner;
    }

    public void setName (String name) {
        this.name =name;
    }

    public ArrayList<Aufgabe> getTasks () {
        return tasks;
    }

    public void addAufgabe (Aufgabe aufgabe) {
        tasks.add(aufgabe);
    }
}


