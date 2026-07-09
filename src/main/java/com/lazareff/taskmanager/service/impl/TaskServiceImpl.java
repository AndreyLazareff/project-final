package com.lazareff.taskmanager.service.impl;

import com.lazareff.taskmanager.dto.task.TaskCreateRequest;
import com.lazareff.taskmanager.dto.task.TaskResponse;
import com.lazareff.taskmanager.dto.task.TaskUpdateRequest;
import com.lazareff.taskmanager.entity.Task;
import com.lazareff.taskmanager.entity.User;
import com.lazareff.taskmanager.enums.TaskStatus;
import com.lazareff.taskmanager.mapper.TaskMapper;
import com.lazareff.taskmanager.repository.TaskRepository;
import com.lazareff.taskmanager.service.CurrentUserService;
import com.lazareff.taskmanager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;
    private final CurrentUserService currentUserService;

    @Override
    public TaskResponse create(TaskCreateRequest request) {

        User currentUser = currentUserService.getCurrentUser();

        Task task = taskMapper.toEntity(request);

        task.setUser(currentUser);
        task.setStatus(TaskStatus.TODO);

        task = taskRepository.save(task);

        return taskMapper.toResponse(task);

    }

    @Override
    public TaskResponse getById(Long id) {
        return null;
    }

    @Override
    public List<TaskResponse> getAll() {
        return null;
    }

    @Override
    public TaskResponse update(Long id, TaskUpdateRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
