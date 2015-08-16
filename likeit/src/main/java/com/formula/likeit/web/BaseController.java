package com.formula.likeit.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formula.likeit.entity.User;
import com.formula.likeit.service.IUserService;

@RestController
public class BaseController {
	
	@Resource(name="userService")
	IUserService userService;
	
	@RequestMapping("/demo")
	public String demo(){
		List<User> userlist = userService.findAll();
		for(User u : userlist){
			System.out.println(u);
		}
		return "demo";
	}
}