package com.pratice.service;

import java.util.List;

import com.pratice.entity.Teacher;

public interface TeacherService extends BaseService<Teacher> {
	public void saveTeacherList(List<Teacher> list);
	public Long count();
	public List<Teacher> getNotFullTeacher();
}
