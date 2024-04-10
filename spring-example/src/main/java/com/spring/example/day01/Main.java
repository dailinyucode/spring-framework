package com.spring.example.day01;

import com.spring.example.base.SimpleBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
		classPathXmlApplicationContext.getEnvironment().setActiveProfiles("test");
		classPathXmlApplicationContext.setConfigLocation("classpath:/spring/*.xml");
		classPathXmlApplicationContext.addApplicationListener(event -> System.out.println(event.getSource()));
		classPathXmlApplicationContext.refresh();
		classPathXmlApplicationContext.publishEvent(new ApplicationEvent(new SimpleBean()) {});
		classPathXmlApplicationContext.addBeanFactoryPostProcessor(new BeanFactoryPostProcessor() {
			@Override
			public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

			}
		});

		SimpleBean simpleBean = (SimpleBean) classPathXmlApplicationContext.getBean("simpleBean1");
		System.out.println(simpleBean.getMultiSimpleBean().getName());
		simpleBean.print("sour");
		StandardEnvironment standardEnvironment = new StandardEnvironment();
	}
}
