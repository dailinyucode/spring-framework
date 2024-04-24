package com.spring.example.day01;

import com.spring.example.base.SimpleBean;
import com.spring.example.base.SimpleBeanContain;
import com.spring.example.base2.HeBuildObj;
import com.spring.example.context.MyClassPathXmlApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new MyClassPathXmlApplicationContext();
		classPathXmlApplicationContext.getEnvironment().setActiveProfiles("test");
		classPathXmlApplicationContext.setConfigLocation("classpath:/spring/*.xml");
		classPathXmlApplicationContext.refresh();

		SimpleBeanContain bean = classPathXmlApplicationContext.getBean(SimpleBeanContain.class);
		System.out.println(bean);
//		heBuildObj.build();
	}
}
