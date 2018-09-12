package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.TeacherDao;
import com.pratice.entity.Teacher;
import com.pratice.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;
	@Transactional
	@Override
	public Teacher getEntityById(String id) {
		// TODO Auto-generated method stub
		return teacherDao.getEntityById(id);
	}

	@Override
	public void saveEntity(Teacher entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Teacher> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(Teacher entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEntity(Teacher entity) {
		// TODO Auto-generated method stub

	}

}
