package ru.egar.user.userRole;

import ru.egar.task.Task;
import ru.egar.task.taskType.TaskType;
import ru.egar.user.User;

public class Analyst extends User {

    public Analyst(String name) {
        super(name, UserRole.ANALYST);
    }

    public void SetTask(Task task, User executor){
        super.SetTask(task, executor, TaskType.DEVELOPMENT);
    }
}
