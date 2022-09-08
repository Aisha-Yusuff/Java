package todo;

import java.util.ArrayList;

public class ToDo {
    ArrayList<String> tasks = new ArrayList<String>();
    public static void main(String[] args) {}

    public ArrayList<String> addTask(String task) {
        tasks.add(task);
        // return the array list with new task
        return tasks;
    }
}
