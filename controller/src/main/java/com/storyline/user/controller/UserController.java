package com.storyline.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.storyline.todo.service.TodoService;
import com.storyline.todo.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	private static final Logger LOGGER = LogManager
			.getLogger("com.storyline.controller");

	public UserController(UserService userService) {
		if (userService == null) {
			throw new IllegalArgumentException(userService + " Bean creation error!");
		}
		this.userService = userService;

	}
}
