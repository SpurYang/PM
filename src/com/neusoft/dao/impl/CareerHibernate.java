package com.neusoft.dao.impl;

import java.sql.SQLException;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.CareerDao;
import com.neusoft.model.CareerInf;
import com.neusoft.model.FamilyRelation;


public class CareerHibernate extends GenericDaoHibernate<CareerInf, Integer>implements CareerDao {

//	@Override
//	public void delete(CareerInf entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public List<CareerInf> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
	public void deleteById(final long id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from CareerInf c where c.EId=?");
				query.setLong(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
	}

	@Override
	public void changeById(final long id, final String Sdate, final String Edate, final String unit,
			final String Work, final String Post, final Long Money, final String Proman,
			final String pPost, final String Phone, final String Note) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("update CareerInf c set c.caSdate=?,c.caEdate=?,c.caUnit=?,c.caWork=?,c.caPost=?,c.caMoney=?,c.caProman=?,c.pmPost=?,c.pmPhone=?,c.pmNote=?where c.EId=?");
				query.setString(0, Sdate);
				query.setString(1,Edate);
				query.setString(2, unit);
				query.setString(3, Work);
				query.setString(4, Post);
				query.setLong(5, Money);
				query.setString(6, Proman);
				query.setString(7, pPost);
				query.setString(8, Phone);
				query.setString(9, Note);
				query.setLong(10,id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public CareerInf findlaAll(Long id) {
		// TODO Auto-generated method stub
		Long[] param = {id};
		List<CareerInf> list = this.getHibernateTemplate().find("from CareerInf a where a.EId=?",param);
		if(list.size() > 0){
			return list.get(0);
		}else {
			return null;
		}
	}
	

}
