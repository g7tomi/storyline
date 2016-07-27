package com.storyline.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.storyline.todo.service.TodoService;
import com.storyline.todo.service.UserService;
import com.storyline.todo.service.impl.TodoServiceImpl;
import com.storyline.user.dao.UserDao;
import com.storyline.user.dao.mappers.UserMapper;
import com.storyline.user.service.impl.UserServiceImpl;

public class AppConfig {
	

	private static final String DB_URL = "jdbc:mysql://localhost:3306/customerdb";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

	
    @Bean
    public TodoService getTodoService(
   // 		TodoDao todoDao
    		//EmailService emailService
    		) {
    	return new TodoServiceImpl(
 //   			todoDao
    			);
    }

    @Bean
    public UserService getUserService(
    		UserDao userDao
    		//EmailService emailService
    		) {
    	return new UserServiceImpl(
    			userDao
    			);
    }
    
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DRIVER_CLASS_NAME);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername(DB_USERNAME);
		dataSource.setPassword(DB_PASSWORD);

		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		return (SqlSessionFactory)sessionFactory.getObject();
	}
	
    @Bean
    public UserMapper getUserMapper() throws Exception {
      SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
      return sessionTemplate.getMapper(UserMapper.class);
    }
    
	
}
