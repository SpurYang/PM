package com.neusoft.web;

import java.util.List;

import com.neusoft.model.DeptbackInf;
import com.neusoft.model.PostbackInf;
import com.neusoft.service.postbackfindService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PostbackfindAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String id;
	private PostbackInf keyPost;
	
	public PostbackInf getKeyPost() {
		return keyPost;
	}
	public void setKeyPost(PostbackInf keyPost) {
		this.keyPost = keyPost;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	private postbackfindService keypostService;

	public void setKeypostService(postbackfindService keypostService) {
		this.keypostService = keypostService;
	}

	public String findPost(){
		List<PostbackInf> list =keypostService.findByEId(Long.parseLong(this.id));
		if(list==null){
			return "editor";
		}else{
			
		    ActionContext.getContext().getSession().put("list", list);
		    return "success";
		}
		
	}
	public String findDsEid(){
		List<DeptbackInf> list1 =keypostService.findDsEid(Long.parseLong(this.id));
		if(list1==null){
			return "editordept";
		}else{
			
		    ActionContext.getContext().getSession().put("list1", list1);
		    return "success";
		}
	}


}
