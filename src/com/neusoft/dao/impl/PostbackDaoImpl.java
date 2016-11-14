package com.neusoft.dao.impl; 

import java.sql.SQLException;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import com.neusoft.dao.Postbackdao;
import com.neusoft.model.PostbackInf;

public class PostbackDaoImpl extends GenericDaoHibernate<PostbackInf, Long>
            implements Postbackdao{
	 public void delete(final Long postBackID){
		 this.getHibernateTemplate().executeFind(new HibernateCallback(){
			 public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				 SQLQuery sql=session.createSQLQuery("delete from  postback_inf where ps_Eid=?");
				 sql.setLong(0, postBackID);
				 int isRight=sql.executeUpdate();
				 System.out.println(isRight);
				 return null;
			 }
		 });
	}
	 public void updateID(final PostbackInf postBackinf){
		 this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session){
				SQLQuery sql=session.createSQLQuery("UPDATE postback_inf set ps_post=?,ps_type=?,ps_reason=?,ps_note=? where ps_eid=?");
				 sql.setString(0, postBackinf.getPsPost());
				 sql.setString(1, postBackinf.getPsType());
				 sql.setString(2, postBackinf.getPsReason());
				 sql.setString(3, postBackinf.getPsNote());
				 sql.setLong(4, postBackinf.getPsEid());
				 int isRight=sql.executeUpdate();
				 System.out.println(isRight);
				 return null;
			}
		 });
	 }

}
