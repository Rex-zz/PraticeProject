package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.StuReportDao;
import com.pratice.entity.StuReport;

@Repository
public class StuReportDaoImpl extends BaseSessionFactory implements
		StuReportDao {

	@Override
	public StuReport getEntityById(String id) {
		// TODO Auto-generated method stub
		return getSession().get(StuReport.class, id);
	}

	@Override
	public void saveEntity(StuReport entity) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(entity);
	}

	@Override
	public List<StuReport> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(StuReport entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEntity(StuReport entity) {
		// TODO Auto-generated method stub

	}

}
