package duke.task;

public abstract class Task {

    private String name;
    private boolean isDone;

    /**
     * Constructor for a Task object
     *
     * @param name the name of the task
     */
    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    /**
     * Returns a string representing the task
     *
     * @return a string representing the task
     */
    @Override
    public String toString() {
        if (isDone) {
            return "[X] " + this.name;
        }
        return "[ ] " + this.name;
    }

    /**
     * Marks a task as done
     */
    public void markDone() {
        this.isDone = true;
    }

    public abstract String printToFile();

    public String getName() {
        return this.name;
    }

    public boolean getDone() {
        return this.isDone;
    }
}
