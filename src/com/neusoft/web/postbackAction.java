package com.neusoft.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.web.struts.ActionSupport;

import com.neusoft.model.DeptbackInf;
import com.neusoft.model.PostbackInf;
import com.neusoft.service.DeptbackSercice;
import com.neusoft.service.PostbackService;
import com.opensymphony.xwork2.ActionContext;

public class postbackAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private PostbackService postbackSer;
	private PostbackInf postbackInf;
	
	private Long id;
	private List<PostbackInf> list;
	
	public List<PostbackInf> getList() {
		return list;
	}

	public void setList(List<PostbackInf> list) {
		this.list = list;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public PostbackInf getPostbackInf() {
		return postbackInf;
	}

	public void setPostbackInf(PostbackInf postbackInf) {
		this.postbackInf = postbackInf;
	}

	public void setPostbackSer(PostbackService postbackSer) {
		this.postbackSer = postbackSer;
	}
	public String add() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		postbackInf.setPsDate(sdf.format(new Date()));
		postbackSer.savePost(postbackInf);
		 ActionContext.getContext().getSession().put("post", postbackInf);
		return "success";
	}
	
	public String delet() {
		postbackSer.deletPost(id);
		return "success";
	}
	
	public String UpDate(){
		
		
		postbackSer.update(postbackInf);
		return "success";
	}

	
	
	
	
	



}
