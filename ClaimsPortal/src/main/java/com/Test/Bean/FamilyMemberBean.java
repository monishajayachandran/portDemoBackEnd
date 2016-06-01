package com.Test.Bean;

public class FamilyMemberBean {
	private long id;
	private String userName;
	private String memberId;
	private String age;
	private String card1frontURL;
	private String card1backURL;
	private String card2frontURL;
	private String card2backURL;
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
	
	
	public String getCard1frontURL() {
		return card1frontURL;
	}
	public void setCard1frontURL(String card1frontURL) {
		this.card1frontURL = card1frontURL;
	}
	public String getCard1backURL() {
		return card1backURL;
	}
	public void setCard1backURL(String card1backURL) {
		this.card1backURL = card1backURL;
	}
	public String getCard2frontURL() {
		return card2frontURL;
	}
	public void setCard2frontURL(String card2frontURL) {
		this.card2frontURL = card2frontURL;
	}
	public String getCard2backURL() {
		return card2backURL;
	}
	public void setCard2backURL(String card2backURL) {
		this.card2backURL = card2backURL;
	}
	public FamilyMemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FamilyMemberBean(long id, String userName, String memberId, String age, String card1frontURL,
			String card1backURL, String card2frontURL, String card2backURL) {
		super();
		this.id = id;
		this.userName = userName;
		this.memberId = memberId;
		this.age = age;
		this.card1frontURL = card1frontURL;
		this.card1backURL = card1backURL;
		this.card2frontURL = card2frontURL;
		this.card2backURL = card2backURL;
	}
	
	
}
