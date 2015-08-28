package com.formula.likeit.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formula.likeit.service.IMongoService;

@RestController
public class MongoController {
	
	@Resource(name="mongoService")
	IMongoService mongoService;
	
	@RequestMapping("/mongotest")
	public void mongotest(){
		mongoService.query();
	}
}
