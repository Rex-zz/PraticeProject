package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.StuIntentionDao;
import com.pratice.entity.StuIntention;

@Repository
public class StuIntentionDaoImpl extends BaseSessionFactory implements
		StuIntentionDao {

	@Override
	public StuIntention getEntityById(String id) {
		// TODO Auto-generated method stub
		return getSession().get(StuIntention.class, id);
	}

	@Override
	public void saveEntity(StuIntention entity) {
		// TODO Auto-generated method stub
		getSession().save(entity);
	}

	@Override
	public List<StuIntention> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(StuIntention entity) {
		// TODO Auto-generated method stub
		getSession().update(entity);
	}

	@Override
	public void deleteEntity(StuIntention entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public StuIntention getEntityBySid(String sid) {
		// TODO Auto-generated method stub
		StuIntention sti = new StuIntention();
		String hql = "from StuIntention where s_id= ?0";
		sti = (StuIntention) getSession().createQuery(hql).setParameter(0, sid)
				.uniqueResult();
		return sti;
	}

}
