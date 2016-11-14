package com.neusoft.web;

import java.util.List;

import com.neusoft.model.PostInf;
import com.neusoft.service.PostInfService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PostInfAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	

	private PostInf postinf;
	private PostInfService postinfService;
	private long PId;

	public long getPId() {
		return PId;
	}

	public void setPId(long id) {
		PId = id;
	}
	public PostInf getPostinf() {
		return postinf;
	}

	public void setPostinf(PostInf postinf) {
		this.postinf = postinf;
	}

	public void setPostinfService(PostInfService postinfService) {
		this.postinfService = postinfService;
	}

	public String find(){
		PostInf pi =postinfService.findPAll(this.getPId());
		ActionContext.getContext().getSession().put("p", pi);
		return "success";	
	}
	
	public String save() {
		postinf.getPId();
		postinf.getPName();
		postinf.getPOrg();
		postinf.getPType();
		postinfService.save(postinf);
		return "success";

	}
	public String findAll(){
		
		List<PostInf> list=postinfService.findAll();
		ActionContext.getContext().getSession().put("list", list);
		return "success";
	}
   public String deletePostInf(){
	   this.getPId();
	   postinfService.deletePostInf(this.getPId());
	   return "success";
	   
   }
	

}
