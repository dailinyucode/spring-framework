package com.spring.example.base2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HeBuildObj {

	@Autowired
	private HeFactorObj factorObj;

	public void build() {
		factorObj.factor();
		System.out.println("Hello World!");
	}
}
