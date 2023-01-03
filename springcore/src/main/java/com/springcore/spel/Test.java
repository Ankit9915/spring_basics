package com.springcore.spel;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d=con.getBean("demo", Demo.class);
		
		System.out.println(d);
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression=temp.parseExpression("{76+109}");
		System.out.println(expression.getValue());
		


	}

}
