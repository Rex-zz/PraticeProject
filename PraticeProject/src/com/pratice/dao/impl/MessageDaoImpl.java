package com.pratice.dao.impl;

import java.util.List;

import org.hibernate.Session;
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

	}

	@Override
	public void deleteEntity(Message entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long getCount() {
		// TODO Auto-generated method stub
		String sql="select count(*) from Message";
		return (Long) getSession().createQuery(sql).uniqueResult();
		
	}
	
}
