package com.example.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.domain.Todo;

public interface TodoService {
	List<Todo> getTodos(Sort sort) throws Exception;

	void postTodo(Todo todo) throws Exception;

	void deleteTodo(Long Id) throws Exception;

	Todo findTodoById(Long Id) throws Exception;
}
