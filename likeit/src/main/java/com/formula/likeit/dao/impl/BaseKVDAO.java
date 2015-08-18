package com.formula.likeit.dao.impl;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.formula.likeit.dao.IBaseKV;

public class BaseKVDAO implements IBaseKV{

	private MongoTemplate mongoTemplate;
	
	
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	@Resource(name="mongoTemplate")
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void insert() {
		
	}

	@Override
	public void findAll() {
		System.out.println(mongoTemplate);
		
	}
	
}
