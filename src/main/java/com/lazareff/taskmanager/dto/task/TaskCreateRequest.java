package com.lazareff.taskmanager.dto.task;

import com.lazareff.taskmanager.enums.TaskPriority;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskCreateRequest {

    private String title;

    private String description;

    private TaskPriority priority;
}
