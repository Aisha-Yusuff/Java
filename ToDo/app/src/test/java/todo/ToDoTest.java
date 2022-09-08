package todo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ToDoTest {
    // It is initialised with an empty list of tasks.
    @Test
     public void shouldIntialiseWithEmptyList() {
        ToDo todo = new ToDo();
        assertTrue("Initial task list is empty", todo.tasks.isEmpty());
    }
    // It has a addTask method that takes a String argument and adds it to the list of tasks. 
    @Test
    public void shouldAddTasks() {
        // 1. Instantiate the ToDo class
        ToDo todo = new ToDo();
        // 2. Create mock data that test will compare against
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("Buy milk");

        // 3. Write assertion statement
        assertEquals("should add argument into task array list", expectedList, todo.addTask("Buy milk"));

    }

    @Test
    public void shouldReturnListOfTasks() {
        ToDo todo = new ToDo();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("Buy milk");
        expectedList.add("Buy eggs");

        todo.addTask("Buy milk");
        todo.addTask("Buy eggs");
        
        assertEquals("Should return a list of all tasks", expectedList, todo.getTasks());
    }

}
