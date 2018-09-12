package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.AdminDao;
import com.pratice.entity.Admin;
@Repository
public class AdminDaoImpl extends BaseSessionFactory implements AdminDao {

	@Override
	public Admin getEntityById(String id) {
		// TODO Auto-generated method stub
		return getSession().get(Admin.class, Integer.parseInt(id));
	}

	@Override
	public void saveEntity(Admin entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Admin> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEntity(Admin entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEntity(Admin entity) {
		// TODO Auto-generated method stub

	}

}
