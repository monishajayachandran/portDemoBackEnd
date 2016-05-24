package com.Test.Bean;

public class MemberBean {

	private long id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String userName;
	private String password;
	private String memberId;
	private String planName;
	private String lastLogin;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	
	
	public MemberBean(long id, String firstName, String lastName, String emailAddress, String userName, String password,
			String memberId, String planName, String lastLogin) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.userName = userName;
		this.password = password;
		this.memberId = memberId;
		this.planName = planName;
		this.lastLogin = lastLogin;
	}
	public MemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public String toString() {
		return String.format("{firstName:%s,lastName:%s,emailAddress:%s,userName:%s,password:%s,memberId:%s,planName:%s,lastLogin:%s}",firstName,lastName,emailAddress,userName,password,memberId,planName,lastLogin);
	}
	*/
	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", userName=" + userName + ", password=" + password + ", memberId=" + memberId
				+ ", planName=" + planName + ", lastLogin=" + lastLogin + "]";
	}

	
	
	
	
}
