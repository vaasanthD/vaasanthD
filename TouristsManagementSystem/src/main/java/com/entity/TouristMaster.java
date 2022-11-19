package com.entity;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Tourist_Master")
public class TouristMaster {
	@Id
	@GeneratedValue(generator="generate",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="generate",initialValue=1,allocationSize=1)
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

	@OneToMany(mappedBy="tourist")  
	private List<TouristContact> contacts = new ArrayList<>();
	
    
	public void addContacts(TouristContact contactNumbers) {
		contacts.add(contactNumbers);
		contactNumbers.setTourist(this); 
	}
	public TouristMaster() {
		super();
	}
	
	

	public TouristMaster(String name, String address, String date, Double bookingAmount) {
		super();
		this.name = name;
		this.address = address;
		this.date = date;
		this.bookingAmount = bookingAmount;
	}
	public List<TouristContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<TouristContact> contacts) {
		this.contacts = contacts;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	/*@Override
	public String toString() {
		return "TouristMaster [id=" + id + ", name=" + name + ", address=" + address + ", date=" + date
				+ ", bookingAmount=" + bookingAmount + ", contacts=" + contacts + "]";
	}*/

	
    
}
