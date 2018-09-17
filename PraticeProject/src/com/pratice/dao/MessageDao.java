package com.pratice.dao;

import com.pratice.entity.Message;

public interface MessageDao extends BaseDao<Message>{
	public Long getCount();
}
