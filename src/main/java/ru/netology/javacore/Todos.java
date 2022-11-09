package ru.netology.javacore;

import java.util.Set;
import java.util.TreeSet;


public class Todos {
    private Set<String> set = new TreeSet<>();

    public void addTask(String task) {
        if (set.size() < 7) {
            set.add(task);
        }
    }

    public void removeTask(String task) {
        set.remove(task);
    }

    public Set<String> getAllTasks() {
        return set;
    }
}
