package com.storyline.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.storyline.todo.service.TodoService;

@Controller
public class UserController {

	private TodoService todoService;

	private static final Logger LOGGER = LogManager
			.getLogger("com.storyline.controller");

	public UserController(TodoService todoService) {
		if (todoService == null) {
			throw new IllegalArgumentException(todoService + " Bean creation error!");
		}
		this.todoService = todoService;

	}
}
