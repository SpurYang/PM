package com.neusoft.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.FamilyDao;
import com.neusoft.model.FamilyRelation;
import com.neusoft.model.Language;

public class FamilyHibernate extends GenericDaoHibernate<FamilyRelation, Integer>implements FamilyDao{

	@Override
	public void deleteById(final long id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from FamilyRelation f where f.EId=?");
				query.setLong(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
		
	}

	@Override
	public void changeById(final long id, final String relation, final String name, final String unit,
			final String post, final String phone) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("update FamilyRelation f set f.ERelation=?,f.reName=?,f.reUnit=?,f.rePost=?,f.rePhone=?where f.EId=?");
				query.setString(0, relation);
				query.setString(1,name);
				query.setString(2, unit);
				query.setString(3, post);
				query.setString(4, phone);
				query.setLong(5, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public FamilyRelation findlaAll(Long id) {
		// TODO Auto-generated method stub
		Long[] param = {id};
		List<FamilyRelation> list = this.getHibernateTemplate().find("from FamilyRelation f where f.EId=?",param);
		if(list.size() > 0){
			return list.get(0);
		}else {
			return null;
		}
	}

}
