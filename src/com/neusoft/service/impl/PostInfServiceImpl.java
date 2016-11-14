package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.dao.PostInfDao;
import com.neusoft.dao.impl.GenericDaoHibernate;
import com.neusoft.model.PostInf;
import com.neusoft.service.PostInfService;

public class PostInfServiceImpl implements PostInfService {
	
	private PostInfDao postinfDao;

	public void setPostinfDao(PostInfDao postinfDao) {
		this.postinfDao = postinfDao;
	}
	
	public void save(PostInf pi) {
		postinfDao.save(pi);
		
	}

	public List<PostInf> findAll() {
		
		
		return postinfDao.findAll();
	}


	public void deletePostInf(Long id) {
	
		postinfDao.deletebyid(id);
	}

	

	public void updatePostInf(Long PId, String PName, String PType, Long POrg) {
	
		postinfDao.updatePostInf(PId, PName, PType, POrg);
		
	}

	public PostInf findPAll(Long pid) {

		return postinfDao.findPostInfAll(pid);
	}
}
