package com.pip.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pip.dao.IStudentDAO;
import com.pip.domain.Student;

public class StudentDAOImpl extends HibernateDaoSupport implements IStudentDAO{

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>) getHibernateTemplate().find("from Student");
	}

	@Override
	public Student findStudentById(int studentID) {
		// TODO Auto-generated method stub
		return (Student) getHibernateTemplate().get(Student.class, studentID);
	}

	@Override
	public Integer insertStudent(Student student) {
		// TODO Auto-generated method stub
		return (Integer) getHibernateTemplate().save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(student);
	}

	@Override
	public Student findStudentByName(String studentName) {
		// TODO Auto-generated method stub
		List<Student> list = getHibernateTemplate().find("from Student as s where s.studentName=?", studentName); 
		return list.get(0);
	}
	
	@Override
	public void update(Student student){
		getHibernateTemplate().update(student);
	}

	

}
