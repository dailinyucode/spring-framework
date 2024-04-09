package com.spring.example.base;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class DlyMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("执行前。。。。");
		Object invoke = method.invoke(obj.getClass().getDeclaredConstructor().newInstance(), args);
		System.out.println("执行后。。。");
		return invoke;
	}
}
