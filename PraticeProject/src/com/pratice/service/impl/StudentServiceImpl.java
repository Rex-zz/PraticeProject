package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StudentDao;
import com.pratice.entity.Student;
import com.pratice.service.StudentService;

@Service
@Scope("prototype")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Transactional
	@Override
	public Student getEntityById(String id) {
		return studentDao.getEntityById(id);
	}

	@Transactional
	@Override
	public void saveEntity(Student entity) {
		// TODO Auto-generated method stub
		studentDao.saveEntity(entity);
	}

	@Override
	public List<Student> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(Student entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteEntity(Student entity) {
		// TODO Auto-generated method stub
	}

}
