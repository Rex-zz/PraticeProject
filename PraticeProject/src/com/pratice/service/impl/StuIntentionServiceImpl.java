package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StuIntentionDao;
import com.pratice.entity.StuIntention;
import com.pratice.service.StuIntentionService;

@Service
@Scope("prototype")
@Transactional
public class StuIntentionServiceImpl implements StuIntentionService {
	@Autowired
	private StuIntentionDao stuIntentionDao;

	@Override
	public StuIntention getEntityById(String id) {
		// TODO Auto-generated method stub
		return stuIntentionDao.getEntityById(id);
	}

	@Override
	public void saveEntity(StuIntention entity) {
		// TODO Auto-generated method stub
		stuIntentionDao.saveEntity(entity);
	}

	@Override
	public List<StuIntention> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(StuIntention entity) {
		// TODO Auto-generated method stub
		stuIntentionDao.updateEntity(entity);
	}

	@Override
	public void deleteEntity(StuIntention entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public StuIntention getEntityBySid(String sid) {
		// TODO Auto-generated method stub
		return stuIntentionDao.getEntityBySid(sid);
	}

}
