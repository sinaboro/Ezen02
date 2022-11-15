package com.ezen.ex01;

public class SeoulHotelVO {
	private int no;  //번호
	private String hotelName; //호텔명
	private int reviewCnt; //리뷰수
	private double gradeCnt; //리뷰평점
	private String SeoulAddress;  //주소
	
	public SeoulHotelVO() { }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String gethotelName() {
		return hotelName;
	}

	public void sethotelName(String name) {
		this.hotelName = name;
	}

	public int getReviewCnt() {
		return reviewCnt;
	}

	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}

	public double getGradeCnt() {
		return gradeCnt;
	}

	public void setGradeCnt(double gradeCnt) {
		this.gradeCnt = gradeCnt;
	}

	public String getSeoulAddress() {
		return SeoulAddress;
	}

	public void setSeoulAddress(String seoulAddress) {
		SeoulAddress = seoulAddress;
	}
	
	
}
