package com.lazareff.taskmanager.repository;

import com.lazareff.taskmanager.entity.Task;
import com.lazareff.taskmanager.entity.User;
import com.lazareff.taskmanager.enums.RoleType;
import com.lazareff.taskmanager.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByUser(User user);

    List<Task> findAllByUserId(Long userId);

    List<Task> findAllByStatus(TaskStatus status);

    List<Task> findAllByUserIdAndStatus(Long userId, TaskStatus status);

}
