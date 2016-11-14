package com.neusoft.dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.PeriodInfDao;
import com.neusoft.dao.ProbationDao;
import com.neusoft.model.EmployeeInf;
import com.neusoft.model.PeriodInf;

public class ProbationDaoImpl extends GenericDaoHibernate<EmployeeInf, Long> implements ProbationDao{


	
	public void probatiDao(final PeriodInf empoloyee){
			 this.getHibernateTemplate().executeFind(new HibernateCallback(){
				 public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
					 SQLQuery sql=session.createSQLQuery("update   PERIOD_INF set PE_EDATE=?, PE_COMMENT=? where E_ID=?");
					 sql.setString(0, empoloyee.getPeEdate());
					 sql.setString(1, empoloyee.getPeComment());
					 sql.setLong(2, empoloyee.getEId());
					 int isRight=sql.executeUpdate();
					 System.out.println(isRight);
					 return null;
				 }
			 });
		}

		
	

}
