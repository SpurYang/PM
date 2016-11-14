package com.neusoft.dao.impl;

import java.util.List;
import com.neusoft.dao.DeptBackFindDao;
import com.neusoft.model.DeptbackInf;


public class DeptBackFindInfDaoImpl extends GenericDaoHibernate<DeptbackInf, Long> 
              implements DeptBackFindDao{
	@SuppressWarnings("unchecked")
	public List<DeptbackInf> DsEID(Long DS_EID){
		long param =DS_EID;
		List<DeptbackInf> list = this.getHibernateTemplate().find(
				"from DeptbackInf a where a.dsEid=? ", param);
		if(list.size()==0) {
			return null;
		}else {
			return list;
		}
	}

}
