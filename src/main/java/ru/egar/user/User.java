package ru.egar.user;

import ru.egar.statistic.Statistic;
import ru.egar.task.Task;
import ru.egar.task.taskType.TaskType;
import ru.egar.user.userRole.UserRole;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final String id;

    private final String name;

    private UserRole role;

    private List<Task> tasks = new ArrayList<>();



    public User(String name, UserRole role) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.role = role;
        Statistic.addNewUser(this);
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", tasks=" + tasks +
                '}';
    }

    protected void SetTask(Task task, User executor, TaskType type){
        task.setTaskSetter(this);
        task.setExecutor(executor);
        task.setTaskType(type);
        executor.addTask(task);
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }
}
