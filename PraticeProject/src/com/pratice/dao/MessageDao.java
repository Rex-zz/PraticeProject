package com.pratice.dao;

import java.util.List;

import com.pratice.entity.Message;

public interface MessageDao extends BaseDao<Message>{
	public Long getCount(Integer type);
	public List<Message> getEntityList(Object page,Integer type);
}
