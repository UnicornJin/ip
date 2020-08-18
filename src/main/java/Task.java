package main.java;

public class Task {
    protected boolean status; //false for Not done; true for done
    protected String content;

    public Task(String content) {
        this.status = false;
        this.content = content;
    }

    public void done() {
        this.status = true;
    }

    @Override
    public String toString() {
        return "[" + (status ? "√" : "×") + "] " + content;
    }
}