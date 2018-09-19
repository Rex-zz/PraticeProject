package com.pratice.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.pratice.dao.MessageDao;
import com.pratice.entity.Message;
@Repository
public class MessageDaoImpl extends BaseSessionFactory implements MessageDao {

	@Override
	public Message getEntityById(String id) {
		// TODO Auto-generated method stub
		Message message = getSession().get(Message.class, Integer.parseInt(id));
		return message;
	}

	@Override
	public void saveEntity(Message entity) {
		// TODO Auto-generated method stub
		getSession().save(entity);
	}

	@Override
	public List<Message> getEntityList(Object o) {
		// TODO Auto-generated method stub
		String sql="from Message m order by m.date desc";
		return getSession().createQuery(sql).setFirstResult(((int) o)*15).setMaxResults(15).list();
	}

	@Override
	public void updateEntity(Message entity) {
		// TODO Auto-generated method stub
		getSession().update(entity);
	}

	@Override
	public void deleteEntity(Message entity) {
		// TODO Auto-generated method stub
		getSession().delete(entity);
	}

	@Override
	public Long getCount(Integer type) {
		String sql=null;
		Query query=null;
		if(type==null) {
			sql="select count(*) from Message";
			query = getSession().createQuery(sql);
		}else {
			sql="select count(*) from Message m where m.type=:type";
			query = getSession().createQuery(sql).setParameter("type", type);
		}
			
		return (Long) query.uniqueResult();
		
	}

	@Override
	public List<Message> getEntityList(Object page, Integer type) {
		// TODO Auto-generated method stub
		String sql="from Message m where m.type=:type order by m.date desc";
		return getSession()
				.createQuery(sql)
				.setParameter("type", type)			
				.setFirstResult(((int) page)*15)
				.setMaxResults(15).list();
	}
	
}
