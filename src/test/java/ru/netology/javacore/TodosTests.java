package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TodosTests {

    @Test
    public void addTaskPositive() {
        Todos todos = new Todos();
        String task = "Good morning";

        todos.addTask(task);

        Assertions.assertEquals(task, todos.getAllTasks().stream().findFirst().get());
    }

    @Test
    public void addTaskIfExeedLimit() {
        Todos todos = new Todos();

        String task = "Good morning";
        for (int i = 0; i < 7; i++) {
            todos.addTask(task+i);
        }

        todos.addTask(task);

        Assertions.assertEquals(7, todos.getAllTasks().size());
    }


    @Test
    public void getAllTasksSorted() {
        Todos todos = new Todos();

        String task = "A";
        String task1 = "B";

        todos.addTask(task1);
        todos.addTask(task);

        Set<String> allTasks = todos.getAllTasks();
        Iterator<String> iterator = allTasks.iterator();
        Assertions.assertEquals(task, iterator.next());
        Assertions.assertEquals(task1, iterator.next());
    }

    @Test
    public void removeTaskShouldRemove() {
        Todos todos = new Todos();
        String task = "Good morning";
        todos.addTask(task);

        todos.removeTask(task);

        Assertions.assertEquals(0, todos.getAllTasks().size());
    }
}