package com.pratice.dao;

import java.util.List;

import com.pratice.entity.Student;

public interface StudentDao extends BaseDao<Student> {
	public void saveStudentList(List<Student> list);
	public Long countStudent();
}
