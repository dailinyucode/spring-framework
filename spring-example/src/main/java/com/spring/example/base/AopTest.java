package com.spring.example.base;

import org.aspectj.lang.JoinPoint;

public class AopTest {

	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("发生之前");
	}

	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("发生之后");
	}
}
