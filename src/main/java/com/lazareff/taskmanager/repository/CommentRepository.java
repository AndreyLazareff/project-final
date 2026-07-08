package com.lazareff.taskmanager.repository;

import com.lazareff.taskmanager.entity.Comment;
import com.lazareff.taskmanager.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByTaskId(Long taskId);
}
