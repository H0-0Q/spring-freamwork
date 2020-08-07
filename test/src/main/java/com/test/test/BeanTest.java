package com.test.test;

import com.test.dao.UserDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author H&Q
 * @date 2020-08-05 23:28:19
 * @description bean生命周期测试
 */
@Component(value = "testBean")
public class BeanTest implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {
	private BeanTest (){
		System.out.println("Bean 初始化");
	}
	@Autowired
	private UserDao userDao;
	@Override
	public void setBeanName(String name) {
		System.out.println("Bean 的 name 为：" + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(applicationContext);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before bean" + bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after bean" + bean);
		return bean;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(userDao);
		System.out.println("initializingBean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean 销毁");
	}
}
