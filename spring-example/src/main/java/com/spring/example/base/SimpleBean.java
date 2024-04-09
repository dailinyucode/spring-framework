package com.spring.example.base;

import org.springframework.beans.factory.annotation.Value;

public class SimpleBean {

	private SimpleBeanContain simpleBeanContain;

	public SimpleBeanContain getSimpleBeanContain() {
		return simpleBeanContain;
	}

	public void setSimpleBeanContain(SimpleBeanContain simpleBeanContain) {
		this.simpleBeanContain = simpleBeanContain;
	}

	public MultiSimpleBean getMultiSimpleBean() {
		return new MultiSimpleBean();
	}

	public void print(String test){
		System.out.println(test);
	}
}
