package likeit;

import org.junit.Test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.formula.likeit.dao.impl.BaseMongoDAO;



@ContextConfiguration(locations = { "classpath*:dispatcher-servlet.xml" })
public class TestMongoConn extends AbstractJUnit4SpringContextTests{
	@Test
	public void getConn(){
		BaseMongoDAO mongo = new BaseMongoDAO();
		mongo.findAll();
	}
}
