package ru.egar.user.userRole;

import ru.egar.task.Task;
import ru.egar.task.taskType.TaskType;
import ru.egar.user.User;

public class Developer extends User {

    public Developer(String name) {
        super(name, UserRole.DEVELOPER);
    }


    public void createTask(Task task, User executor){
        super.SetTask(task, executor, TaskType.TESTING);
    }


}
