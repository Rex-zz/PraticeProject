package com.pratice.service;

import com.pratice.entity.StuIntention;

public interface StuIntentionService extends BaseService<StuIntention> {
	public StuIntention getEntityBySid(String sid);

}
