package todo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToDoTest {
    // it is initialised with an empty list of tasks.
    @Test public void shouldIntialiseWithEmptyList() {
        ToDo todo = new ToDo();
        assertTrue("Initial task list is empty", todo.tasks.isEmpty());
    }
    
}
