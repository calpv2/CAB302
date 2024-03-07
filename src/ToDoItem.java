public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    public ToDoItem (String description, boolean isDone) {
        this.isDone = false;
        this.description = description;
    }
    public boolean isDone(){
        return isDone;
    }

    public void SetIsDone(boolean isDone){
        this.isDone = isDone;
    }

    public String getDescription(){
        return description;
    }

    public void SetDescription(String description){
        this.description = description;
    }

}
