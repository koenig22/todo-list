package de.dhbw;

import java.util.ArrayList;

public class Benutzer {
    private String name;
    private ArrayList<Liste> listen =new ArrayList<Liste>();

    public Benutzer (String name) {
        this.name=name;
    }

    public void setName (String name) {
       this.name=name;
    }

    public String getName () {
        return this.name;
    }

    public void addListe (Liste liste) {
        listen.add(liste);
    }

    public ArrayList<Liste> getListe () {
        return this.listen;
    }

}
