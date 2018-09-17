package com.pratice.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.StuDiaryDao;
import com.pratice.entity.StuDiary;

@Repository
public class StuDiaryDaoImpl extends BaseSessionFactory implements StuDiaryDao {

	@Override
	public StuDiary getEntityById(String id) {
		// TODO Auto-generated method stub
		return getSession().get(StuDiary.class, Integer.parseInt(id));
	}

	@Override
	public void saveEntity(StuDiary entity) {
		// TODO Auto-generated method stub
		getSession().save(entity);
	}

	@Override
	public List<StuDiary> getEntityList(Object o) {
		// TODO Auto-generated method stub
		List<StuDiary> diaries = new ArrayList<StuDiary>();
		String hql = "from StuDiary where stu_id= ?0 order by date desc";
		diaries = getSession().createQuery(hql).setParameter(0, o)
				.getResultList();
		return diaries;
	}

	@Override
	public void updateEntity(StuDiary entity) {
		// TODO Auto-generated method stub
		getSession().update(entity);
	}

	@Override
	public void deleteEntity(StuDiary entity) {
		// TODO Auto-generated method stub

	}

}
