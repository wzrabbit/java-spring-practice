package com.wzrabbit.domain;
import java.util.Date;

public class BoardVO {
	private Integer id;
	private String title;
	private String content;
	private Date date_;
	
	public Integer getNo() {
		return id;
	}
	public void setNo(Integer input) {
		this.id = input;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String input) {
		this.title = input;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String input) {
		this.content = input;
	}
	public Date getDate_() {
		return date_;
	}
	public void setDate_(Date input) {
		this.date_ = input;
	}
	
	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", title=" + title + ", content=" + content + ", date_=" + date_ + "]";
	}
}
