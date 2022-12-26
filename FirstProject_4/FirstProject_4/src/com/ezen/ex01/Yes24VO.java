package com.ezen.ex01;

public class Yes24VO {
	
	private int    rank; 		//순위
	private String category; 	//카테고리
	private String title; 		//책이름 
	private String price;		//가격
	private String summary;		//줄거리 
	private String author;		//저자 
	private String pub;			//출판사  
	private String grade;		//평점 


	public Yes24VO() {

	}

	//멤버변수들을 다 private로 막아놨기때문에 게터세터를 통해 사용 ?
	
	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPub() {
		return pub;
	}


	public void setPub(String pub) {
		this.pub = pub;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}

	