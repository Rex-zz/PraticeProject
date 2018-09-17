package com.pratice.service;

import java.util.List;

import com.pratice.entity.Student;

public interface StudentService extends BaseService<Student>{
	public void saveStudentList(List<Student> list);
	public Long count();
	public void updateStudentTutor(Student stu);
}
