package com.storyline.user.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.storyline.todo.service.UserService;
import com.storyline.todo.service.bean.GetUsersServiceResponse;
import com.storyline.user.bean.User;
import com.storyline.user.dao.UserDao;

public class UserServiceImpl implements UserService{
	private static final Logger LOGGER = LogManager
			.getLogger("com.storyline.user.service.impl");

	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		if (userDao == null) {
			throw new IllegalArgumentException(userDao
					+ " Bean creation error!");
		}
		this.userDao = userDao;
	}
	public GetUsersServiceResponse getUsers() {
		GetUsersServiceResponse reply = new GetUsersServiceResponse();
		List<User> users = userDao.getUsers();

		reply.setUsers(users);
		return reply;
	}


}
