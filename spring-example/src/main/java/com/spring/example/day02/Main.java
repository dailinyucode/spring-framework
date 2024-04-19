package com.spring.example.day02;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;

public class Main {
    public static void main(String[] args) {
        // 创建要设置属性的Bean实例
        MyClass myClass = new MyClass();
        
        // 创建BeanWrapper并设置要操作的目标对象
        BeanWrapper wrapper = new BeanWrapperImpl(myClass);
        
        // 创建要设置的属性及其对应的值
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.add("name", "John");
        propertyValues.add("age", 30);
        
        // 设置属性值
        wrapper.setPropertyValues(propertyValues);
        
        // 打印设置后的属性值
        System.out.println("Name: " + myClass.getName()); // 输出：Name: John
        System.out.println("Age: " + myClass.getAge());   // 输出：Age: 30
    }
}

class MyClass {
    private String name;
    private int age;
    
    // Getter 和 Setter 方法省略
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
