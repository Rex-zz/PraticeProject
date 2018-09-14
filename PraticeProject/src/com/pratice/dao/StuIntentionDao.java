package com.pratice.dao;

import com.pratice.entity.StuIntention;

public interface StuIntentionDao extends BaseDao<StuIntention> {
	public StuIntention getEntityBySid(String sid);

}
