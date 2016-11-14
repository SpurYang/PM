package com.neusoft.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.DeptInfDao;
import com.neusoft.model.DeptInf;
import com.neusoft.model.EmployeeInf;
import com.neusoft.model.PostInf;

public class DeptInfDaoImpl  extends GenericDaoHibernate<DeptInf, Long> implements DeptInfDao{

	public void deletebyid(final Long id) {

		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from DeptInf d where d.DId=?");
				query.setLong(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
		});
		
	}
	

	@Override
	public DeptInf findDeptInfAll(Long DId) {
		Long[] param = {DId};
		List<DeptInf> list = this.getHibernateTemplate().find("from DeptInf d where d.DId=?",param);
		if(list.size() > 0){
			return list.get(0);
		}else {
			return null;
		}
	}

	@Override
	public void updateDeptInf(final Long DId, final String DName, final String DType,
			final String DPhone, final String DFax, final String DNote, final String DSuperior,
			final String DDate) {
		this.getHibernateTemplate().executeFind(new HibernateCallback(){
			

		public Object doInHibernate(Session session)
		throws HibernateException, SQLException {
			Query query = session.createQuery("update DeptInf d set d.DName=?,d.DType=?,d.DPhone=?,d.DFax=?,d.DNote=?,d.DSuperior=?,d.DDate=? where d.DId=?");
			query.setString(0, DName);
			query.setString(1, DType);
			query.setString(2, DPhone);
			query.setString(3, DFax);
			query.setString(4, DNote);
			query.setString(5, DSuperior);
			query.setString(6, DDate);
			query.setLong(7, DId);
		
			int isRight = query.executeUpdate();
			System.out.println(isRight);
			return null;
		}
	});
}


	@Override
	public List<EmployeeInf> findbydept(String EDept) {
		String[] param = {EDept};
		List<EmployeeInf> list = this.getHibernateTemplate().find("from EmployeeInf d where d.EDept=?",param);
		if(list.size() > 0){
			return list;
		}else {
			return null;
		}
	}
}
