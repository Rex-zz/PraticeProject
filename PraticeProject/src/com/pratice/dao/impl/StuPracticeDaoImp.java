package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.StuPracticeDao;
import com.pratice.entity.StuPractice;

@Repository
public class StuPracticeDaoImp extends BaseSessionFactory implements
		StuPracticeDao {

	@Override
	public StuPractice getEntityById(String id) {
		// TODO Auto-generated method stub
		return getSession().get(StuPractice.class, id);
	}

	@Override
	public void saveEntity(StuPractice entity) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(entity);
	}

	@Override
	public List<StuPractice> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(StuPractice entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEntity(StuPractice entity) {
		// TODO Auto-generated method stub

	}

}
