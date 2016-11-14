package com.neusoft.dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.EmployeeInfDao;
import com.neusoft.model.EmployeeInf;

public class EmployeeInfDaoHibernate extends GenericDaoHibernate<EmployeeInf, Integer> implements EmployeeInfDao{

	
	public void updateById(final String EName,final String ESex,
			final String EBithday,final String ESid,final String EDept,
			final String EPost,final String EIndate,final String ECardate,
			final String EFormat,final String ESource, final String EPolitical,
			final String ENation,final String ENaresidence,final String EPhone,
			final String EEmail,final Long EHeight,final String EBlood,
			final String EMarstatus,final String EBirthplace,final String ERegplace,
			final String ERecord,final String EDegree,final String ESchool,
			final String EProfession,final String EGradate,final String ETrialstatus,
			final String ETrstartdate,final String ETrenddate,final Integer id)
	{
		
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("update EmployeeInf e set e.EName=?,e.ESex=?,e.EBithday=?,e.ESid=?,e.EDept=?,e.EPost=?,e.EIndate=?,e.ECardate=?,e.EFormat=?,e.ESource=?,e.EPolitical=?,e.ENation=?,e.ENaresidence=?,e.EPhone=?,e.EEmail=?,e.EHeight=?,e.EBlood=?,e.EMarstatus=?,e.EBirthplace=?,e.ERegplace=?,e.ERecord=?,e.EDegree=?,e.ESchool=?,e.EProfession=?,e.EGradate=?,e.ETrialstatus=?,e.ETrstartdate=?,e.ETrenddate=?  where e.EId=?");
			
				query.setString(0, EName);
				query.setString(1, ESex);
				query.setString(2,EBithday);
				query.setString(3,ESid);
				query.setString(4,EDept);
				query.setString(5,EPost);
				query.setString(6,EIndate);
				query.setString(7,ECardate);
				query.setString(8,EFormat);
				query.setString(9,ESource);
				query.setString(10,EPolitical);
				query.setString(11,ENation);
				query.setString(12,ENaresidence);
				query.setString(13,EPhone);
				query.setString(14,EEmail);
				query.setLong(15,EHeight);
				query.setString(16,EBlood);
				query.setString(17,EMarstatus);
				query.setString(18,EBirthplace);
				query.setString(19,ERegplace);
				query.setString(20,ERecord);
				query.setString(21,EDegree);
				query.setString(22,ESchool);
				query.setString(23,EProfession);
				query.setString(24,EGradate);
				query.setString(25,ETrialstatus);
				query.setString(26,ETrstartdate);
				query.setString(27,ETrenddate);
				query.setInteger(28,id);
				
				
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
	}
	
	
	public void deleteById(final Integer id)
	{
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from EmployeeInf e where e.EId=?");
				query.setInteger(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
	}
	
	public void induction(final Integer id,final String EDept,final String EPost,final String EIndate,
			final String ETrialstatus,final String ETrstartdate,final String ETrenddate) {
		
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("update EmployeeInf e set e.EDept=?,e.EPost=?,e.EIndate=?,e.ETrialstatus=?,e.ETrstartdate=?,e.ETrenddate=?  where e.EId=?");
			
				query.setString(0, EDept);
				query.setString(1, EPost);
				query.setString(2, EIndate);
				query.setString(3, ETrialstatus);
				query.setString(4, ETrstartdate);
				query.setString(5, ETrenddate);
				query.setInteger(6,id);
				
				
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
		
	}
}
