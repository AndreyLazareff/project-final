package com.lazareff.taskmanager.dto.task;

import com.lazareff.taskmanager.enums.TaskPriority;
import com.lazareff.taskmanager.enums.TaskStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskUpdateRequest {

    private String title;

    private String description;

    private TaskPriority priority;

    private TaskStatus status;
}
