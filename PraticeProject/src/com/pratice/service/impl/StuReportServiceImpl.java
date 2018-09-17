package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StuReportDao;
import com.pratice.entity.StuReport;
import com.pratice.service.StuReportService;

@Service
@Scope("prototype")
@Transactional
public class StuReportServiceImpl implements StuReportService {
	@Autowired
	private StuReportDao stureportdao;

	@Override
	public StuReport getEntityById(String id) {
		// TODO Auto-generated method stub
		return stureportdao.getEntityById(id);
	}

	@Override
	public void saveEntity(StuReport entity) {
		// TODO Auto-generated method stub
		stureportdao.saveEntity(entity);
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
