package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.StuSummaryDao;
import com.pratice.entity.StuSummary;

@Repository
public class StuSummaryDaoImpl extends BaseSessionFactory implements
		StuSummaryDao {

	@Override
	public StuSummary getEntityById(String id) {
		// TODO Auto-generated method stub
		return getSession().get(StuSummary.class, id);
	}

	@Override
	public void saveEntity(StuSummary entity) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(entity);
	}

	@Override
	public List<StuSummary> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(StuSummary entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEntity(StuSummary entity) {
		// TODO Auto-generated method stub

	}

}
