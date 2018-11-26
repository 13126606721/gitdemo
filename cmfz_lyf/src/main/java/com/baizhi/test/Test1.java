package com.baizhi.test;

import com.baizhi.dao.CourseDao;
import com.baizhi.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class Test1 {
	@Test
	public void test1() throws SQLException{
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		/*UserService  cc=(UserService) c.getBean("userService");
		List<User> queryAll = cc.queryAll();
		System.out.println(queryAll);
		for (User user : queryAll) {
			String pass = DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes());
	        cc.updateMD5(pass,user.getUserId());
	        System.out.println(user.getUserPassword());
	        System.out.println(cc.queryAll());
		}*/
        CourseDao o = (CourseDao) c.getBean("courseDao");
        List<Course> courses = o.queryByMarking();
        System.out.println(courses);
    }
}
