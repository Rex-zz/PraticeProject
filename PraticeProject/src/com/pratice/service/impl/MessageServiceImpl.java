package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.MessageDao;
import com.pratice.entity.Message;
import com.pratice.service.MessageService;
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;
	@Transactional
	@Override
	public Message getEntityById(String id) {
		// TODO Auto-generated method stub
		return messageDao.getEntityById(id);
	}
	@Transactional
	@Override
	public void saveEntity(Message entity) {
		// TODO Auto-generated method stub
		messageDao.saveEntity(entity);
	}
	@Transactional
	@Override
	public List<Message> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return messageDao.getEntityList(o);
	}

	@Override
	public void updateEntity(Message entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEntity(Message entity) {
		// TODO Auto-generated method stub

	}
	@Transactional
	@Override
	public Long getCount(Integer type) {
		// TODO Auto-generated method stub
		return messageDao.getCount(type);
	}
	@Transactional
	@Override
	public List<Message> getEntityList(Object page, Integer type) {
		// TODO Auto-generated method stub
		return messageDao.getEntityList(page,type);
	}

}
