package com.neusoft.service.impl;

import java.util.List;
import com.neusoft.dao.DeptBackFindDao;
import com.neusoft.dao.PostbackfindDao;
import com.neusoft.model.DeptbackInf;
import com.neusoft.model.PostbackInf;
import com.neusoft.service.postbackfindService;

public class PostbackfindServiceImpl implements postbackfindService {
	
	private PostbackfindDao keyPostfind;
	private DeptBackFindDao deptBacFindkDao;
	
	public void setDeptBacFindkDao(DeptBackFindDao deptBacFindkDao) {
		this.deptBacFindkDao = deptBacFindkDao;
	}

	public void setKeyPostfind(PostbackfindDao keyPostfind) {
		this.keyPostfind = keyPostfind;
	}
	
	public List<PostbackInf> findByEId(Long id) {
			return keyPostfind.PsEid(id);
	}
	

	public List<DeptbackInf> findDsEid(Long DsEid){
		return  deptBacFindkDao.DsEID(DsEid);
	}

	


	

}
