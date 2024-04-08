package com.spring.example.base;

import org.springframework.beans.factory.annotation.Value;

public class SimpleBean {

	private String name;

	public void send() {
		System.out.println(name + " am send method from SimpleBean!");
	}

	public void setName(String name) {
		this.name = name;
	}
}
