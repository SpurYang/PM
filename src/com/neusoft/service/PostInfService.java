package com.neusoft.service;

import java.util.List;

import com.neusoft.model.PostInf;

public interface PostInfService {
	
	
	public void save(PostInf pi); 
	
	public List<PostInf> findAll();
	
	public PostInf findPAll(Long id);

	public void deletePostInf(Long id);

	public void updatePostInf(Long PId, String PName, String PType, Long POrg);

}
