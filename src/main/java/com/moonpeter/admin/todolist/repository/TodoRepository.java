package com.moonpeter.admin.todolist.repository;

import com.moonpeter.admin.todolist.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}