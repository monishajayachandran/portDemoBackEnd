package com.Test.Bean;

public class ClaimsBean {
	
	private String id;
	private String serviceDate;
	private String patient;
	private String provider;
	private String totalBilled;
	private String status;
	private String pharmacyClaimNo;
	private String network;
	private String medication;
	private String type;
	private String pay;
	private String quantity;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getTotalBilled() {
		return totalBilled;
	}
	public void setTotalBilled(String totalBilled) {
		this.totalBilled = totalBilled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPharmacyClaimNo() {
		return pharmacyClaimNo;
	}
	public void setPharmacyClaimNo(String pharmacyClaimNo) {
		this.pharmacyClaimNo = pharmacyClaimNo;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public ClaimsBean(String id, String serviceDate, String patient, String provider, String totalBilled, String status,
			String pharmacyClaimNo, String network, String medication, String type, String pay, String quantity) {
		super();
		this.id = id;
		this.serviceDate = serviceDate;
		this.patient = patient;
		this.provider = provider;
		this.totalBilled = totalBilled;
		this.status = status;
		this.pharmacyClaimNo = pharmacyClaimNo;
		this.network = network;
		this.medication = medication;
		this.type = type;
		this.pay = pay;
		this.quantity = quantity;
	}
	public ClaimsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
