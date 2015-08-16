package com.formula.likeit.dao;

import java.util.List;

import com.formula.likeit.entity.User;

public interface IUserDAO{
	
	public void test();
	
	public boolean insert();
	public boolean update();
	public boolean delete();
	
	public User getById(Long id);
	public List<User> findAllUser();
	
}
