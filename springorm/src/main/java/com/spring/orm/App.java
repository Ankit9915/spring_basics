package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao studentDao=context.getBean("StudentDao",StudentDao.class);
        
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        
        while(go) {
        System.out.println("******Welcome To Spring Orm*******");
        System.out.println("Press 1 for add new Student");
        System.out.println("press 2 for display all Students");
        System.out.println("press 3 for get detail of single Student");
        System.out.println("press 4 for delete Students");
        System.out.println("press 5 for update Student");
        System.out.println("press 6 for exit");
        
        try {
        	int input=Integer.parseInt(br.readLine());
        	switch(input) {
        	case 1://add new student
        		System.out.println("Enter User ID: ");
        		int uId=Integer.parseInt(br.readLine());
        		
        		System.out.println("Enter User Name: ");
        		String uName = br.readLine();
        		
        		System.out.println("Enter User City: ");
        		String uCity = br.readLine();
        		
        		Student s=new Student();
        		s.setStudentId(uId);
        		s.setStudentName(uName);
        		s.setStudentCity(uCity);
        		
        		
        		int r = studentDao.insert(s);
        		System.out.println(r+" Student added");
        		System.out.println("*******************************************");
        		
        		
        		break;
        	case 2:	//display all students
        		List<Student> allStudents = studentDao.getAllStudents();
        		for(Student st:allStudents) {
        			
        			System.out.println("Name:"+st.getStudentName()+"    Id: "+st.getStudentId()+"   City: "+ st.getStudentCity());
        			System.out.println("________________________________________");
        		}
        		System.out.println("**********************************************");
        		break;
        	case 3://detail of single student
        		System.out.println("Enter User ID: ");
        		int userId=Integer.parseInt(br.readLine());
        		Student student = studentDao.getStudent(userId);
        		System.out.println("Name:"+student.getStudentName());
        		System.out.println("Id:"+student.getStudentId());
        		System.out.println("City:"+student.getStudentCity());
        		System.out.println("________________________________________");
        		break;
        	case 4://Delete student
        		System.out.println("Enter used id to be deleted");
        		int dId=Integer.parseInt(br.readLine());
        		studentDao.deleteStudent(dId);
        		break;
        	case 5://update student
        		System.out.println("Enter id to be updated");
        		int Id=Integer.parseInt(br.readLine());
        		System.out.println("Enter new name");
        		String n1 = br.readLine();
        		System.out.println("Enter new City");
        		String n2 = br.readLine();
        		Student s1=new Student();
        		s1.setStudentName(n1);
        		s1.setStudentCity(n2);
        		s1.setStudentId(Id);
        		studentDao.updateStudent(s1);
        		System.out.println("**************************");
        		break;
        	case 6://exit
        		go=false;
        		break;
        		
        	}
        
			
		} catch (Exception e) {
			System.out.println("Invalid input try with another one!!");
			System.out.println(e.getMessage());
			
		}
        
        
        
        
        
        
    	
    	
    }System.out.println("THANK YOU");
}
}