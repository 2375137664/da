package com.sunzelong.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
/***
 * 
 * @author 孙泽龙
 *
 * 2019年11月26日
 */
public class Link {
	
	int  id;
	
	@Length(max=255,min=5,message="长度超出范围")
	//@URL
	String url;
	
	@Length(max=10,min=2)
	String name;
	
	Date created;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	


}
