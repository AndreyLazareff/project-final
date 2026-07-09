package com.lazareff.taskmanager.service;

import com.lazareff.taskmanager.dto.task.TaskCreateRequest;
import com.lazareff.taskmanager.dto.task.TaskResponse;
import com.lazareff.taskmanager.dto.task.TaskUpdateRequest;

import java.util.List;

public interface TaskService {

    TaskResponse create(TaskCreateRequest request);

    TaskResponse getById(Long id);

    List<TaskResponse> getAll();

    TaskResponse update(Long id, TaskUpdateRequest request);

    void delete(Long id);

}
