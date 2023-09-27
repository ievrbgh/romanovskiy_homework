package ru.egar.task;

import ru.egar.task.taskAction.TaskAction;
import ru.egar.task.taskStatus.TaskStatus;
import ru.egar.task.taskType.TaskType;
import ru.egar.user.User;

import java.time.LocalDate;
import java.util.UUID;

public class Task {

    private final String id;

    private String title;

    private String description;

    private LocalDate dateStart;

    private LocalDate deadline;

    private TaskStatus status;

    private String timeSpent; // Изменить тип данных на что то более подходящее

    private TaskType taskType;

    private User taskSetter;

    private User executor;

    public Task(String title, String description, LocalDate dateStart, LocalDate deadline) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.dateStart = dateStart;
        this.deadline = deadline;

    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public User getTaskSetter() {
        return taskSetter;
    }

    public void setTaskSetter(User taskSetter) {
        this.taskSetter = taskSetter;
    }

    public User getExecutor() {
        return executor;
    }

    public void setExecutor(User executor) {
        this.executor = executor;
    }
}
