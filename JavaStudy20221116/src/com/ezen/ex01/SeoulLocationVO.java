package com.ezen.ex01;

/*
create table SeoulLcation(
	    no NUMBER(4) PRIMARY key,
	    title NVARCHAR2(20),
	    titleInfo NVARCHAR2(200),
	    address NVARCHAR2(50),
	    phone NVARCHAR2(20),
	    info NVARCHAR2(100),
	    taffic NVARCHAR2(200)
	);
*/
public class SeoulLocationVO {
	
	private int no;
	private String title;
	private String titleInof;
	private String address;
	private String phone;
	private String infoTime;
	private String taffic;
   
	public SeoulLocationVO() {
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleInof() {
		return titleInof;
	}

	public void setTitleInof(String titleInof) {
		this.titleInof = titleInof;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInfoTime() {
		return infoTime;
	}

	public void setInfoTime(String infoTime) {
		this.infoTime = infoTime;
	}

	public String getTaffic() {
		return taffic;
	}

	public void setTaffic(String taffic) {
		this.taffic = taffic;
	}
	
}
