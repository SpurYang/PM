package com.neusoft.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.LanguageDao;
import com.neusoft.model.Language;

public class LanguageHibernate extends GenericDaoHibernate<Language, Integer>implements LanguageDao {

//	@Override
//	public void delete(Language entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public List<Language> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	@Override
	public void deleteById(final long id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from Language l where l.EId=?");
				query.setLong(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
	}

	@Override
	public void changeById(final long id,final String language,final String ability) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("update Language l set l.ELanguage=?,l.EAbility=? where l.EId=?");
				query.setString(0, language);
				query.setString(1,ability);
				query.setLong(2, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
			
		});
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public Language findlaAll(Long id) {
		Long[] param = {id};
		List<Language> list = this.getHibernateTemplate().find("from Language l where l.EId=?",param);
		if(list.size() > 0){
			return list.get(0);
		}else {
			return null;
		}
		
	}
	

//	@Override
//	public Language save(Language entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void update(Language entity) {
//		// TODO Auto-generated method stub
//
//	}

}
