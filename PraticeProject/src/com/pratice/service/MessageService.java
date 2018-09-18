package com.pratice.service;

import java.util.List;

import com.pratice.entity.Message;

public interface MessageService extends BaseService<Message> {
	public Long getCount(Integer type);
	public List<Message> getEntityList(Object page, Integer type);
}
