package com.springcore.jdbc.dao;

import java.util.List;

import com.springcore.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(String studentName);
//	public int notable();
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
	

}
