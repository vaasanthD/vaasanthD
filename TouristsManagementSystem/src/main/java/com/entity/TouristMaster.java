package com.entity;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Tourist_Master")
public class TouristMaster {
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "Tourist_Id")
	private Integer id;

	@Column(name = "Tourist_Name")
	private String name;

	@Column(name = "Address")
	private String address;

	@Column(name = "Tour_date")
	private String date;

	@Column(name = "Booking_Amount")
	private Double bookingAmount;

	@OneToMany(targetEntity=TouristContact.class,cascade=CascadeType.ALL)  
	@JoinColumn(name = "Tourist_Id", referencedColumnName="Tourist_Id")
	private List<TouristContact> contacts = new ArrayList<>();

	public TouristMaster(List<TouristContact> contacts) {
		super();
		this.contacts = contacts;
	}

	public List<TouristContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<TouristContact> contacts) {
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
    
	public Double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	@Override
	public String toString() {
		return "TouristMaster [id=" + id + ", name=" + name + ", address=" + address + ", date=" + date
				+ ", bookingAmount=" + bookingAmount + ", contacts=" + contacts + "]";
	}

	
    
}
