package com.formula.likeit.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.formula.likeit.dao.IBaseMongo;
import com.formula.likeit.service.IMongoService;

@Service("mongoService")
public class MongoServiceImpl implements IMongoService{

	@Resource(name="baseMongoDao")
	IBaseMongo mongotest;
	
	@Override
	public void query() {
		mongotest.findAll();
	}

}
