package com.pratice.service;

import com.pratice.entity.Message;

public interface MessageService extends BaseService<Message> {
	public Long getCount();
}
