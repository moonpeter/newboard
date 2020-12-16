package com.moonpeter.admin.todolist.service;

import com.moonpeter.admin.todolist.domain.Todo;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface TodoService {
    List<Todo> getTodos(Sort sort) throws Exception;

    void postTodo(Todo todo) throws Exception;

    void deleteTodo(Long Id) throws Exception;

    Todo findTodoById(Long Id) throws Exception;
}
