package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.TeacherDao;
import com.pratice.entity.Teacher;
@Repository
public class TeacherDaoImpl extends BaseSessionFactory implements TeacherDao{

	@Override
	public Teacher getEntityById(String id) {
		// TODO Auto-generated method stub
		return 	getSession().get(Teacher.class, id);
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
