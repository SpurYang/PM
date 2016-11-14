package com.neusoft.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.neusoft.dao.PostInfDao;
import com.neusoft.model.PostInf;

public class PostInfDaoImpl extends GenericDaoHibernate<PostInf, Long>  implements PostInfDao{

	public void deletebyid(final Long id) {

		this.getHibernateTemplate().executeFind(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("delete from PostInf p where p.PId=?");
				query.setLong(0, id);
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
		});
		
	}

	public void updatePostInf(final Long PId, final String PName, final String PType, final Long POrg) {
		this.getHibernateTemplate().executeFind(new HibernateCallback(){

		
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("update PostInf p set p.PName=?,p.PType=?,p.POrg=? where  p.PId=?");
				
				query.setString(0, PName);
				query.setString(1, PType);
				query.setLong(2, POrg);
				query.setLong(3, PId);
				
				int isRight = query.executeUpdate();
				System.out.println(isRight);
				return null;
			}
			
		});
		
	}

	@SuppressWarnings("unchecked")
	public PostInf findPostInfAll(Long PId) {
	Long[] param = {PId};
	List<PostInf> list = this.getHibernateTemplate().find("from PostInf p where p.PId=?",param);
	if(list.size() > 0){
		return list.get(0);
	}else {
		return null;
	}
	
	}

}
