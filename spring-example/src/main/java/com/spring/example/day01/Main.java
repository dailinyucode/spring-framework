package com.spring.example.day01;

import com.spring.example.base.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
		classPathXmlApplicationContext.getEnvironment().setActiveProfiles("test");
		classPathXmlApplicationContext.setConfigLocation("classpath:/spring/*.xml");
		classPathXmlApplicationContext.refresh();
		SimpleBean bean1 = classPathXmlApplicationContext.getBean("simpleBean1", SimpleBean.class);
		bean1.send();

		classPathXmlApplicationContext.getEnvironment().setActiveProfiles("dev");
		classPathXmlApplicationContext.refresh();
		SimpleBean bean2 = classPathXmlApplicationContext.getBean("simpleBean1", SimpleBean.class);
		bean2.send();

		classPathXmlApplicationContext.getEnvironment().setActiveProfiles("prod");
		classPathXmlApplicationContext.refresh();
		SimpleBean bean3 = classPathXmlApplicationContext.getBean("simpleBean1", SimpleBean.class);
		bean3.send();

		StandardEnvironment standardEnvironment = new StandardEnvironment();
	}
}
