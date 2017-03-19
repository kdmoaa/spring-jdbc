package com.dto;

import java.util.Date;

public class TodoDto {
	private int id;
	private String title;
	private String description;
	private String staff;
	private Date limit;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public Date getLimit() {
		return limit;
	}
	public void setLimit(Date limit) {
		this.limit = limit;
	}



}
