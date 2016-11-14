package com.neusoft.service;


import com.neusoft.model.PostbackInf;



public interface PostbackService {
	
	public void savePost(PostbackInf postback);
	public void deletPost(Long postBackID);
	public void update(PostbackInf postBack);

}
