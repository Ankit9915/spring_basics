package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
	Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		context.registerShutdownHook();
		
		
		
	System.out.println("+++++++++++++++++++++++++++++++");
		Jalebi j1=(Jalebi) context.getBean("j1");
		System.out.println(j1);
		Example example=(Example) context.getBean("example");
		
		System.out.println(example);
//		

	}

}
