package com.lazareff.taskmanager.dto.task;

import com.lazareff.taskmanager.enums.TaskPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskCreateRequest {

    @NotBlank
    private String title;

    private String description;

    @NotNull
    private TaskPriority priority;
}
