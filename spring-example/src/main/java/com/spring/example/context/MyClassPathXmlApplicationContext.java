package com.spring.example.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	@Override
	protected void initPropertySources() {
		System.out.println("初始化执行.....");
		//设置必须的属性值
		this.getEnvironment().setRequiredProperties("username");
	}
}
