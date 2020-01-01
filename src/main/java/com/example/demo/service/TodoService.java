package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;



@Service
public class TodoService {
    private static ArrayList<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", 
                false));
        todos.add(new Todo(2, "in28Minutes", "Learn Struts", false));
        todos.add(new Todo(3, "in28Minutes", "Learn Hibernate", 
                false));
    }

    public ArrayList<Todo> retrieveTodos(String user) {
        ArrayList<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}