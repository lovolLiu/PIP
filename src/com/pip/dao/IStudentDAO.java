package com.pip.dao;

import java.util.List;

import com.pip.domain.Student;


public interface IStudentDAO {
	public List<Student> findAll();		//返回所有的Student信息
	public Student findStudentById(int studentID);		//通过StudentID查找Student信息
	public Integer insertStudent(Student student);			//插入Student信息
	public void deleteStudent(Student student);		//删除指定Student
	public Student findStudentByName(String studentName);	
	public void update(Student student);
	public List<Student> findStudentByTeamID(Integer teamID);
	public List<Student> findStudentByTeacherID(Integer teacherID);
}
