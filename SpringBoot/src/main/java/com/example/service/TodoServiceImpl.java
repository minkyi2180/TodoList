package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.domain.Todo;
import com.example.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> getTodos(Sort sort) throws Exception {
		return todoRepository.findAll();
	}

	@Override
	public void postTodo(Todo todo) throws Exception {
		todoRepository.save(todo);
		
	}

	@Override
	public void deleteTodo(Long id) throws Exception {
		todoRepository.deleteById(id);
	}

	@Override
	public Todo findTodoById(Long Id) throws Exception {
		return todoRepository.findById(Id).orElse(new Todo());
	}

}
