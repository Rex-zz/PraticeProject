package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StuPracticeDao;
import com.pratice.entity.StuPractice;
import com.pratice.service.StuPracticeService;

@Service
@Scope("prototype")
@Transactional
public class StuPracticeServiceImpl implements StuPracticeService {
	@Autowired
	private StuPracticeDao StuPracticeDao;

	@Override
	public StuPractice getEntityById(String id) {
		// TODO Auto-generated method stub
		return StuPracticeDao.getEntityById(id);
	}

	@Override
	public void saveEntity(StuPractice entity) {
		// TODO Auto-generated method stub
		StuPracticeDao.saveEntity(entity);
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
