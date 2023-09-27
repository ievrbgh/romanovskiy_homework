package ru.egar.user.userRole;

import ru.egar.task.Task;
import ru.egar.task.taskType.TaskType;
import ru.egar.user.User;

public class Admin extends User {

    public Admin(String name) {

        super(name, UserRole.ADMIN);

    }

    public void SetTask(Task task, User executor, TaskType type){
        super.SetTask(task, executor, type);
    }

}