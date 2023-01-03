package com.springcore.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.jdbc.entites.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		//insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		// TODO Auto-generated method stub
		return r;
	}

	public int change(Student student) {
		//update data
		String query="update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		

		return r;
	}
	public int delete(String studentName) {
		//delete data
		String query="delete from student where name=?";
		int r = this.jdbcTemplate.update(query,studentName);
		return r;
	}
	public int notable() {
		String query="drop table student";
		int r = this.jdbcTemplate.update(query);
		return r;
	}
	public Student getStudent(int studentId) {
		//selecting single student data
		String query="select *from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);		
		return student;
	}
	public List<Student> getAllStudents() {
		//selecting multiple student data
		String query="select *from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

	

	

	

	

}
