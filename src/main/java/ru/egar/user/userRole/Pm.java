package ru.egar.user.userRole;

import ru.egar.task.Task;
import ru.egar.task.taskType.TaskType;
import ru.egar.user.User;

public class Pm extends User {

    public Pm(String name) {
        super(name, UserRole.PM);
    }

    public void SetTask(Task task, User executor){
        super.SetTask(task, executor, TaskType.ANALYTICS);
    }
}