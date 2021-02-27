package de.dhbw;

import java.util.ArrayList;

public class Liste {
    private String name;
    private Benutzer owner;
    private ArrayList<Aufgabe> tasks = new ArrayList<Aufgabe>();

    public Liste (String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name =name;
    }

    public ArrayList<Aufgabe> getTasks() {
        return this.tasks;
    }

    public void addAufgabe (Aufgabe aufgabe) {
        tasks.add(aufgabe);
    }
     public void setOwner (Benutzer owner) {
        this.owner=owner;
     }

    @Override
    public String toString() {
        return name;
    }
}


