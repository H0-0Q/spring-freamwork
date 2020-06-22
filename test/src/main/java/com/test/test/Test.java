package com.test.test;

import com.test.config.SpringConfig;
import com.test.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserDao dao = (UserDao) annotationConfigApplicationContext.getBean("dao");
		dao.pringInfo();
	}
}
