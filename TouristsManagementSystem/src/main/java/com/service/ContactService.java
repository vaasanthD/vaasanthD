package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.TouristContact;
import com.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepo;
	
	public void addNumber(TouristContact touristContact) {
		contactRepo.save(touristContact);
	}
}
