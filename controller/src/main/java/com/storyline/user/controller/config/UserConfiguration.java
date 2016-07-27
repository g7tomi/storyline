package com.storyline.user.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.storyline.config.AppConfig;
import com.storyline.todo.service.UserService;
import com.storyline.user.controller.UserController;

@Configuration
@Import(AppConfig.class)
public class UserConfiguration {
	@Bean
	public UserController getUserController(
			UserService userService
			) {
		 return new UserController(userService);
	}
}

