package com.neusoft.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.AdminDao;
import com.neusoft.model.Admin;

public class AdminHibernate extends GenericDaoHibernate<Admin, Integer>
		implements AdminDao {
		private List<Admin> list = null;
	@SuppressWarnings("unchecked")
	public Admin isCheckLogin(final String username, final String password) {
		
		//使用原声的SQL语句来完成DAO
		
		this.getHibernateTemplate().executeFind(new HibernateCallback(){
			//这个方法给我们提供一个Hibernate中的session持久化管理器，从而能够执行select insert delete update
			public Object doInHibernate(Session session) {
				SQLQuery query = session.createSQLQuery("select * from admin where username=? and password=?");
				query.setString(0, username);
				query.setString(1, password);
				
				query.addEntity(Admin.class);
				list = query.list();
				
				return null;
			}
			
		});
		
		
		/*String[] param = { username, password };
		List<Admin> list = this.getHibernateTemplate().find(
				"from Admin a where a.username=? and a.password=?", param);*/
		if(list.size()==0) {
			return null;
		}else {
			return list.get(0);
		}
	}
}
