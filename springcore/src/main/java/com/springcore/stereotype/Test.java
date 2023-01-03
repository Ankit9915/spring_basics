package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
//		Student student=(Student) con.getBean("student");
	Student student=con.getBean("student",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress().getClass().getName());
		System.out.println(student.hashCode());
		Student s2=con.getBean("student",Student.class);
		System.out.println(s2.hashCode());
		Teacher t1=con.getBean("teacher",Teacher.class);
		Teacher t2=con.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
