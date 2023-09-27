package ru.egar.statistic;

import ru.egar.task.Task;
import ru.egar.user.User;

import java.util.ArrayList;
import java.util.List;

public class Statistic {

    private static List<User> users = new ArrayList<>();

    private static List<Task> tasks = new ArrayList<>();

    public static List<User> getUserList() {
        return users;
    }

    public static void addNewUser(User user) {
        users.add(user);
    }

    public static List<Task> getTaskList() {
        return tasks;
    }

    public static void addNewTask(Task task) {
        tasks.add(task);
    }

}
