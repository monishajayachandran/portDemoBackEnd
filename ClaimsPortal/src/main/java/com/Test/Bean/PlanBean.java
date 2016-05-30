package com.Test.Bean;

public class PlanBean {
	private long id;
	private String memberId;
	private String member;
	private String benefits;
	private String status;
	private String benefitPeriod;
	private String item;
	private String limit;
	private String usedAmount;
	private String remainingAmount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getBenefits() {
		return benefits;
	}
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBenefitPeriod() {
		return benefitPeriod;
	}
	public void setBenefitPeriod(String benefitPeriod) {
		this.benefitPeriod = benefitPeriod;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getUsedAmount() {
		return usedAmount;
	}
	public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}
	public String getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(String remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	@Override
	public String toString() {
		return "PlanBean [id=" + id + ", memberId=" + memberId + ", member=" + member + ", benefits=" + benefits
				+ ", status=" + status + ", benefitPeriod=" + benefitPeriod + ", item=" + item + ", limit=" + limit
				+ ", usedAmount=" + usedAmount + ", remainingAmount=" + remainingAmount + "]";
	}
	public PlanBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
