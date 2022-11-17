package com.entity;


import javax.persistence.*;

@Entity
@Table(name = "Tourist_Contact")
public class TouristContact{
	@Id
	@Column(name = "Phone_Number")
	private String phoneNumber;
	@Column(name = "Tourist_Id")
	private Integer id;
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "Tourist_id")
	//private TouristMaster tourist;
	
	public TouristContact() {
		super();
	}
	
	public TouristContact(String phoneNumber,Integer id) {
		super();
		this.phoneNumber = phoneNumber;
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TouristContact [phoneNumber=" + phoneNumber + ", id=" + id + "]";
	}
	
	
	
}
