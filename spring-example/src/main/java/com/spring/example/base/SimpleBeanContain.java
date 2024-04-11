package com.spring.example.base;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SimpleBeanContain implements InitializingBean {

	private SimpleBean simpleBean;


	public void setSimpleBean(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	public SimpleBean getSimpleBean() {
		return simpleBean;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("你12312好" + simpleBean);
	}
}
