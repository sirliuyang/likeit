package com.formula.likeit.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.formula.likeit.dao.IUserDAO;
import com.formula.likeit.entity.User;
import com.formula.likeit.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource(name="userDao")
	private IUserDAO userDao;
	
	public IUserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void show() {
		userDao.test();
		System.out.println("display user");
	}

	@Override
	public List<User> findAll() {
		return userDao.findAllUser();
	}

	@Override
	public User queryById(Long id) {
		return userDao.getById(id);
	}

}
