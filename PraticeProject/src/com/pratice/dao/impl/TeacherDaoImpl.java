package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.TeacherDao;
import com.pratice.entity.Teacher;
@Repository
public class TeacherDaoImpl extends BaseSessionFactory implements TeacherDao{

	@Override
	public Teacher getEntityById(String id) {
		// TODO Auto-generated method stub
		return 	getSession().get(Teacher.class, id);
	}

	@Override
	public void saveEntity(Teacher entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> getEntityList(Object o) {
		// TODO Auto-generated method stub
		String hql="from Teacher";
		return (List<Teacher>) getSession().createQuery(hql).list();
	}

	@Override
	public void updateEntity(Teacher entity) {
		// TODO Auto-generated method stub
		getSession().update(entity);
	}

	@Override
	public void deleteEntity(Teacher entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTeacherList(List<Teacher> list) {
		// TODO Auto-generated method stub
		//System.out.println(getSession());
		for(int i=0;i<list.size();i++) {
			getSession().save(list.get(i));
			if(i%50==0) {
				getSession().flush();
				getSession().clear();
			}
		}
	}

	@Override
	public Long countTeacher() {
		// TODO Auto-generated method stub
		String sql="select count(*) from Teacher";
		return (Long) getSession().createQuery(sql).uniqueResult();
	}

	@Override
	public List<Teacher> getNotFullTeacher() {
		// TODO Auto-generated method stub
		String hql="from Teacher where TStunum <10";
		List<Teacher> t = getSession().createQuery(hql).list();
		return t;
	}

}
