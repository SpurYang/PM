package com.neusoft.service;


import java.util.List;

import com.neusoft.model.DeptbackInf;
import com.neusoft.model.PostbackInf;


public interface postbackfindService  {
	
	public  List<PostbackInf> findByEId(Long id);
	public List<DeptbackInf> findDsEid(Long DsEid);
}
