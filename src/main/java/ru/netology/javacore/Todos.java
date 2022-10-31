package ru.netology.javacore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Todos {
    private List<String> list = new ArrayList<>();

    public void addTask(String task) {
        if (list.size() < 7) {
            list.add(task);
        }
    }

    public void removeTask(String task) {
        list.remove(task);
    }

    public List<String> getAllTasks() {
        List<String> stringList = list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return stringList;
    }
}
