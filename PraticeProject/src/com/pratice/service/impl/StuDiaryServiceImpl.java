package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StuDiaryDao;
import com.pratice.entity.StuDiary;
import com.pratice.service.StuDiaryService;

@Service
@Scope("prototype")
@Transactional
public class StuDiaryServiceImpl implements StuDiaryService {
	@Autowired
	private StuDiaryDao StuDiaryDao;

	@Override
	public StuDiary getEntityById(String id) {
		// TODO Auto-generated method stub
		return StuDiaryDao.getEntityById(id);
	}

	@Override
	public void saveEntity(StuDiary entity) {
		// TODO Auto-generated method stub
		StuDiaryDao.saveEntity(entity);
	}

	@Override
	public List<StuDiary> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return StuDiaryDao.getEntityList(o);
	}

	@Override
	public void updateEntity(StuDiary entity) {
		// TODO Auto-generated method stub
		StuDiaryDao.updateEntity(entity);
	}

	@Override
	public void deleteEntity(StuDiary entity) {
		// TODO Auto-generated method stub

	}

}
