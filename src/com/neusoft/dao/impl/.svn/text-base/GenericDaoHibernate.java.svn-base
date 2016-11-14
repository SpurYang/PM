package com.neusoft.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.neusoft.dao.GenericDao;
public abstract class GenericDaoHibernate<T, PK extends Serializable> extends
		HibernateDaoSupport implements GenericDao<T, PK> {
	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	public GenericDaoHibernate() {
		clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@SuppressWarnings("unchecked")
	public T findById(PK id) {

		return (T) this.getHibernateTemplate().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return this.getHibernateTemplate().find("from " + clazz.getName());
	}

	public T save(T entity) {

		this.getHibernateTemplate().save(entity);
		return entity;
	}

	public void update(T entity) {

		this.getHibernateTemplate().update(entity);
	}

	public void delete(T entity) {

		this.getHibernateTemplate().delete(entity);
	}
}
