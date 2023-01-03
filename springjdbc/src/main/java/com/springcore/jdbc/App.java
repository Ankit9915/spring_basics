package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.entites.Student;

import java.util.List;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started!" );
//        System.out.println("Enter the name to be deleted");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
        
        //spring jdbc=> jdbcTemplate;
        ApplicationContext context= new AnnotationConfigApplicationContext(jdbcConfig.class);
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//       INSERT QUERY
       Student student=new Student();
       student.setId(877);
       student.setName("saket");
       student.setCity("madhuban");
////       
       int result = studentDao.insert(student);
       System.out.println("student added " + result);
//       UPDATE QUERY
//       Student student=new Student();
//       student.setId(777);
//       student.setName("Bholu");
//       student.setCity("ballia");
//       int c = studentDao.change(student);
//       System.out.println("row updated"+c);
//        
//       DELETE QUERY
//        int delete = studentDao.delete(s);
//        System.out.println("row deleted "+delete);
//       
//       int remove=studentDao.notable();
//       System.out.println("table is deleted");
       
       //SELECTING SINGLE OBJECT
       
//       Student student = studentDao.getStudent(123);
//       System.out.println(student);
//       
       List<Student> students = studentDao.getAllStudents();
       for(Student s:students) {
    	   System.out.println(s);
    	   
    	   
       }
       
        
    }
    
    
}
