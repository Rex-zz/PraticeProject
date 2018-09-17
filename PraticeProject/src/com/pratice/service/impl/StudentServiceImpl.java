package com.pratice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.dao.StudentDao;
import com.pratice.dao.TeacherDao;
import com.pratice.entity.Student;
import com.pratice.entity.Teacher;
import com.pratice.service.StudentService;

@Service
@Scope("prototype")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private TeacherDao teacherDao;
	
	@Transactional
	@Override
	public Student getEntityById(String id) {
		return studentDao.getEntityById(id);
	}

	@Transactional
	@Override
	public void saveEntity(Student entity) {
		// TODO Auto-generated method stub
		studentDao.saveEntity(entity);
	}
	@Transactional
	@Override
	public List<Student> getEntityList(Object o) {
		// TODO Auto-generated method stub
		return studentDao.getEntityList(o);
	}

	@Override
	public void updateEntity(Student entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteEntity(Student entity) {
		// TODO Auto-generated method stub
	}
	@Transactional
	@Override
	public void saveStudentList(List<Student> list) {
		// TODO Auto-generated method stub
		studentDao.saveStudentList(list);
	}
	@Transactional
	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return studentDao.countStudent();
	}
	@Transactional
	@Override
	public void updateStudentTutor(Student stu) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherDao.getEntityById(stu.getTutor());
		teacher.setTStunum(teacher.getTStunum()+1);
		teacherDao.updateEntity(teacher);
		stu.setTutor(teacher.getTName());
		studentDao.updateEntity(stu);
	}

}
