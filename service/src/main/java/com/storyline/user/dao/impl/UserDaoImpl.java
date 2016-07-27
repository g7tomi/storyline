package com.storyline.user.dao.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.storyline.user.bean.User;
import com.storyline.user.dao.UserDao;
import com.storyline.user.dao.mappers.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {

	private UserMapper userMapper;
	
	private static final Logger LOGGER = LogManager
			.getLogger("com.storyline.user.dao.impl");

	public UserDaoImpl (UserMapper userMapper){
		if(userMapper == null){
			throw new IllegalArgumentException(userMapper + "Bean creation error!");
		}
		this.userMapper= userMapper;
	}
	public List<User> getUsers() {
		return userMapper.getUsers();
	}
}

