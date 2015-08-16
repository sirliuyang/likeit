package likeit;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Test;

import com.formula.likeit.dao.impl.UserDAO;
import com.formula.likeit.entity.User;
import com.formula.likeit.service.impl.UserServiceImpl;

public class UserServiceImplTest {
	
    @Test
    public void testQuery() {
        User expectedUser = new User();
        expectedUser.setUid((long) 1001);
        UserDAO mock = EasyMock.createMock(UserDAO.class);  // Create Mock
        EasyMock.expect(mock.getById((long) 1001)).andReturn(expectedUser);    //录制Mock对象预期行为
        EasyMock.replay(mock);								//重放Mock对象，测试时以录制的对象预期行为代替真实对象的行为

        UserServiceImpl  service = new UserServiceImpl();
        service.setUserDao(mock);
        User user = service.queryById((long) 1001); //调用测试方法
        assertEquals(expectedUser, user); //断言测试结果 
        EasyMock.verify(mock);//验证Mock对象被调用
    }
} 
