package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TodosTests {

    @Test
    public void addTaskPositive() {
        Todos todos = new Todos();
        String task = "Good morning";

        todos.addTask(task);

        Assertions.assertEquals(task, todos.getAllTasks().get(0));
    }

    @Test
    public void addTaskIfExeedLimit() {
        Todos todos = new Todos();

        String task = "Good morning";
        for (int i = 0; i < 7; i++) {
            todos.addTask(task);
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

        List<String> allTasks = todos.getAllTasks();

        Assertions.assertEquals(task, allTasks.get(0));
        Assertions.assertEquals(task1, allTasks.get(1));
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