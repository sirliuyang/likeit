package com.formula.likeit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

/**
* Spring MongoDB configuration file
*/

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {
    @Override
    public @Bean Mongo mongo() throws Exception {
        return new Mongo("127.0.0.1",27017);
    }
    @Override
    public @Bean MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(),"test");
    }
	@Override
	protected String getDatabaseName() {
		return "test";
	}
}
