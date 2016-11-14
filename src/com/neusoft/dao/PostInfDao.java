package com.neusoft.dao;

import com.neusoft.model.PostInf;

public interface PostInfDao extends GenericDao<PostInf, Long> {
	
	
	public void deletebyid(Long id);
	
	public void updatePostInf(Long PId,String PName,String PType,Long POrg);

	public PostInf findPostInfAll(Long PId);


	
}
