package com.neusoft.service.impl;

import com.neusoft.dao.AdminDao;
import com.neusoft.model.Admin;
import com.neusoft.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public void saveAdmin(Admin admin) {
		adminDao.save(admin);
	}

	public Admin validate(String username, String password) {
		return adminDao.isCheckLogin(username, password);
	}

}
