package com.neusoft.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import com.neusoft.dao.PeriodInfDao;
import com.neusoft.model.PeriodEmpInf;
import com.neusoft.model.PeriodInf;

public class PeriodInfHibernate extends GenericDaoHibernate<PeriodInf, Integer>
		implements PeriodInfDao {
	
	//删除p数据
	public void deletebypid(final Long id)
	{
		//Long[] param = { id };
		//this.getHibernateTemplate().find("delete from Userinfo u where u.UId=? ",param);
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from PeriodInf p where p.EId=?");
				query.setLong(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
	}
	//删除e数据
	public void deletebyeid(final Long id)
	{
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from EmployeeInf e where e.EId=?");
				query.setLong(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
	}
	
	//转正
	public void updateEstatus(final String ETrialstatus) {
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				String id = ETrialstatus;
				System.out.println(id);
				Query query = session.createQuery("update EmployeeInf e set e.ETrialstatus='已转正' where e.EId=?");
				query.setString(0, ETrialstatus);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
		});
	}

	
	
	
	//读取数据库
	@Override
	public List<PeriodEmpInf> isShow() {
		final List<PeriodEmpInf> periodinfBean = new ArrayList<PeriodEmpInf>();
		this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {

				SQLQuery sql = session.createSQLQuery("select p.e_id,e.e_name,e.e_dept,e.e_post,p.pe_status,p.pe_sdate,p.pe_edate,p.pe_comment from employee_inf e,period_inf p where e.e_id=p.e_id");
				// sql.setString(0, "");
			/*	sql.setString(0, "EId");
				sql.setString(1, "EName");
				sql.setString(2, "EDept");
				sql.setString(3, "EPost");
				sql.setString(4, "PeStatus");
				sql.setString(5, "PeSdate");
				sql.setString(6, "PeEdate");
				sql.setString(6, "PeComment");*/
				
				List list = sql.list();
				

				for (int i = 0; i < list.size(); i++) {
					PeriodEmpInf periodempinf = new PeriodEmpInf();

					Object[] object = (Object[]) list.get(i);
					periodempinf.setEId(Long.parseLong(object[0].toString()));
					// employeeinf null
					periodempinf.setEName(object[1].toString());
					periodempinf.setEDept(object[2].toString());
					periodempinf.setEPost(object[3].toString());
					periodempinf.setPeStatus(object[4].toString());
					periodempinf.setPeSdate(object[5].toString());
					periodempinf.setPeEdate(object[6].toString());
					periodempinf.setPeComment(object[7].toString());
					periodinfBean.add(periodempinf);

				}
				return null;
			}

		});
		
		return  periodinfBean;
	}

}
