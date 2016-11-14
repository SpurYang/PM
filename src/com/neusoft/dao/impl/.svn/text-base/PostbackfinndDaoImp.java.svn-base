package com.neusoft.dao.impl;

import java.util.List;

import com.neusoft.dao.PostbackfindDao;
import com.neusoft.model.PostbackInf;

public class PostbackfinndDaoImp extends GenericDaoHibernate <PostbackInf, Long>
           implements PostbackfindDao{

	@SuppressWarnings("unchecked")
	public List<PostbackInf> PsEid(Long Ps_EId) {
		
		long param =Ps_EId;
		List<PostbackInf> list = this.getHibernateTemplate().find(
				"from PostbackInf a where a.psEid=? ", param);
		if(list.size()==0) {
			return null;
		}else {
			return list;
		}
	}
	
	

}
