package com.pratice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pratice.dao.StudentDao;
import com.pratice.entity.Student;
/**
 * 继承BaseDaoImpl方便获取SessionFactory的session
 * 实现StudentDao实现基本的增删改查
 * @author 137418235
 */
@Repository
public class StudentDaoImpl extends BaseSessionFactory implements StudentDao {
	@Override
	public Student getEntityById(String id) {
		// TODO Auto-generated method stub
		return getSession().get(Student.class, id);
	}

	@Override
	public void saveEntity(Student entity) {
		// TODO Auto-generated method stub
		
			getSession().save(entity);
		
	}

	@Override
	public List<Student> getEntityList(Object o) {
		// TODO Auto-generated method stub
//		String sql="from Student s order by s.SId asc";
//		return getSession().createQuery(sql).setFirstResult((int)o*15).setMaxResults(15).list();
//		
		String sql="from Student";
		return getSession().createQuery(sql).list();
	}

	@Override
	public void updateEntity(Student entity) {
		// TODO Auto-generated method stub
		getSession().update(entity);
	}

	@Override
	public void deleteEntity(Student entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void saveStudentList(List<Student> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			getSession().save(list.get(i));
			if(i%50==0) {
				getSession().flush();
				getSession().clear();
			}
		}
	}

	@Override
	public Long countStudent() {
		// TODO Auto-generated method stub
		String sql="select count(*) from Student";
		return (Long) getSession().createQuery(sql).uniqueResult();
	}

}
