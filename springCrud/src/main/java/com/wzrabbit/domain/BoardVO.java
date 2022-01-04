package com.wzrabbit.domain;
import java.util.Date;

public class BoardVO {

	private Integer id;
	private String title;
	private String content;
	private Date date_;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer input) {
		System.out.println("아이디값 입력");
		System.out.println(input);
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
		System.out.println("Response from DAO");
		System.out.println(id);
		System.out.println(title);
		return "BoardVO [id=" + id + ", title=" + title + ", content=" + content + ", date_=" + date_ + "]";
	}
}
