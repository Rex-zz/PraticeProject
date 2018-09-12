package com.pratice.dao;

import java.util.List;

public interface BaseDao<T> {
	public T getEntityById(Integer id);
	public void saveEntity(T entity);
	public List<T> getEntityList(Object o);
	public void updateEntity(T entity);
	public void deleteEntity(T entity);
}
