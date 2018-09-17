package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StuSummaryDao;
import com.pratice.entity.StuSummary;
import com.pratice.service.StuSummaryService;

@Service
@Scope("prototype")
@Transactional
public class StuSummaryServiceImpl implements StuSummaryService {
	@Autowired
	private StuSummaryDao stusummarydao;

	@Override
	public StuSummary getEntityById(String id) {
		// TODO Auto-generated method stub
		return stusummarydao.getEntityById(id);
	}

	@Override
	public void saveEntity(StuSummary entity) {
		// TODO Auto-generated method stub
		stusummarydao.saveEntity(entity);
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
