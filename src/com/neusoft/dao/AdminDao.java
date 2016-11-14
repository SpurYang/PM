package com.neusoft.dao;

import com.neusoft.model.Admin;

public interface AdminDao extends GenericDao<Admin, Integer>{
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Admin isCheckLogin(String username,String password);
}
