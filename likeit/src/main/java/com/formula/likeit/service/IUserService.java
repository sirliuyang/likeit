package com.formula.likeit.service;

import java.util.List;

import com.formula.likeit.entity.User;

public interface IUserService {

	void show();
	
	User queryById(Long id);
	
	List<User> findAll();
	
}
