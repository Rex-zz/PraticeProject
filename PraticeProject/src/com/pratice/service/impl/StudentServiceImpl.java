package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StudentDao;
import com.pratice.entity.Student;
import com.pratice.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDaoImpl;
	@Override
	public Student getEntityById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void saveEntity(Student entity) {
		// TODO Auto-generated method stub
		studentDaoImpl.saveEntity(entity);
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
