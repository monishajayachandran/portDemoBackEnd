package com.Test.Bean;

public class FamilyMemberBean {
	private long id;
	private String userName;
	private String memberId;
	private String age;
	private String image1URL;
	private String image2URL;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getImage1URL() {
		return image1URL;
	}
	public void setImage1URL(String image1url) {
		image1URL = image1url;
	}
	public String getImage2URL() {
		return image2URL;
	}
	public void setImage2URL(String image2url) {
		image2URL = image2url;
	}
	
	
	@Override
	public String toString() {
		return "FamilyMemberBean [id=" + id + ", userName=" + userName + ", memberId=" + memberId + ", age=" + age
				+ ", image1URL=" + image1URL + ", image2URL=" + image2URL + "]";
	}
	public FamilyMemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
