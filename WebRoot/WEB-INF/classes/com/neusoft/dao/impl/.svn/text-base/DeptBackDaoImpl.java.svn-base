package com.neusoft.dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.DeptBackDao;
import com.neusoft.model.DeptbackInf;

public class DeptBackDaoImpl extends GenericDaoHibernate<DeptbackInf, Long>
                    implements DeptBackDao{
	public void deletedDeptba(final Long deptBackID){
		 this.getHibernateTemplate().executeFind(new HibernateCallback(){
			 public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				 SQLQuery sql=session.createSQLQuery("delete from  deptback_inf where ds_Eid=?");
				 sql.setLong(0, deptBackID);
				 int isRight=sql.executeUpdate();
				 System.out.println(isRight);
				 return null;
			 }
		 });
	}
	public void updateDeptID(final DeptbackInf deptBackinf){
		 this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session){
				SQLQuery sql=session.createSQLQuery("UPDATE deptback_inf set ds_dept=?,ds_type=?,ds_reason=?,ds_note=? where ds_eid=?");
				 sql.setString(0, deptBackinf.getDsDept());
				 sql.setString(1, deptBackinf.getDsType());
				 sql.setString(2, deptBackinf.getDsReason());
				 sql.setString(3, deptBackinf.getDsNote());
				 sql.setLong(4, deptBackinf.getDsEid());
				 int isRight=sql.executeUpdate();
				 System.out.println(isRight);
				 return null;
			}
		 });
	 }

}
