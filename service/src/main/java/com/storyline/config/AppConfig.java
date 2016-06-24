package com.storyline.config;

import org.springframework.context.annotation.Bean;

import com.storyline.todo.service.TodoService;
import com.storyline.todo.service.impl.TodoServiceImpl;

public class AppConfig {
	
    @Bean
    public TodoService getTodoService(
    		//CustomerDao customerDao, EmailService emailService
    		) {
    	return new TodoServiceImpl(
    			//customerDao
    			);
    }
    
	
}
