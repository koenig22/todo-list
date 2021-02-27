package de.dhbw;

public class Aufgabe {
    private String description;
    private Datum todoUntil;


    public String getDescription() {
        return description;
    }

    public Datum getTodoUntil() {
        return todoUntil;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public void setTodoUntil(Datum todoUntil) {
        this.todoUntil = todoUntil;
    }

    @Override
    public String toString() {
        return "Die Aufgabe \'" + this.description + "\' ist fällig bis zum " + this.todoUntil;
    }
}
