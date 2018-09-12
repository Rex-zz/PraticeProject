package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.AdminDao;
import com.pratice.entity.Admin;
import com.pratice.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	@Transactional
	@Override
	public Admin getEntityById(String id) {
		// TODO Auto-generated method stub
		return adminDao.getEntityById(id);
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
