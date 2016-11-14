package com.neusoft.service.impl;

import com.neusoft.dao.Postbackdao;
import com.neusoft.model.PostbackInf;
import com.neusoft.service.PostbackService;

public class PostbackServiceImpl implements PostbackService {
	
    private Postbackdao postbackDao;
   
	
    public Postbackdao getPostbackDao() {
		return postbackDao;
	}

	public void setPostbackDao(Postbackdao postbackDao) {
		this.postbackDao = postbackDao;
	}
    
	public void savePost(PostbackInf postback) {
		postbackDao.save( postback);
		
	}

	public void deletPost(Long postBackID){
		postbackDao.delete(postBackID);
	}

	public void update(PostbackInf postBack){
		postbackDao.updateID(postBack);
	}
	


}
