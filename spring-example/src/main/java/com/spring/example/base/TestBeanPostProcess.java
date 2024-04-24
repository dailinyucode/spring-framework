package com.spring.example.base;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.time.LocalDateTime;

public class TestBeanPostProcess implements BeanPostProcessor {

	private long start;

    @Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		this.start = System.currentTimeMillis();
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        long end = System.currentTimeMillis();
		System.out.println("加载 " + beanName + " 耗时:" + (end - start));
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
