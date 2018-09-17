package com.pratice.dao;

import java.util.List;

import com.pratice.entity.Teacher;

public interface TeacherDao extends BaseDao<Teacher> {
	public void saveTeacherList(List<Teacher> list);
	public Long countTeacher();
	public List<Teacher> getNotFullTeacher();
}
