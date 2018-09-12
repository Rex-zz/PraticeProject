package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.StudentDao;
import com.pratice.entity.Student;
/**
 * 继承BaseDaoImpl方便获取SessionFactory的session
 * 实现StudentDao实现基本的增删改查
 * @author 137418235
 *
 */
@Repository
public class StudentDaoImpl extends BaseDaoImpl implements StudentDao {

	
	

	@Override
	public Student getEntityById(Integer id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void saveEntity(Student entity) {
		// TODO Auto-generated method stub
		
			getSession().save(entity);
		
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
