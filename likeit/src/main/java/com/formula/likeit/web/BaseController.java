package com.formula.likeit.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.formula.likeit.entity.User;
import com.formula.likeit.service.IUserService;

@RestController
@RequestMapping("/demo")
public class BaseController {
	
	@Resource(name="userService")
	IUserService userService;
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public @ResponseBody User getFirstUser(){
		List<User> userlist = userService.findAll();
		User user = new User();
		for(User u : userlist){
			user = u;
			break;
		}
		return user;
	}
	
	@RequestMapping("/listuser")
	public String listAllUser(Map<String, Object> model){
		List<User> userlist = userService.findAll();
		for(User u : userlist){
			System.out.println(u);
			model.put("person", u);
		}
		return "listuser";
	}
}