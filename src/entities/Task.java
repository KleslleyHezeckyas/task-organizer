package entities;

public class Task {

    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescripition() {
        return description;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void complete(){
        this.completed = true;
    }


    public String toString() {
        return (completed ? "[✔]" : "[ ]") + " " + description;
    }
}