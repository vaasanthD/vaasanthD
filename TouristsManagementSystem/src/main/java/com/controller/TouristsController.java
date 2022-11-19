package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entity.TouristContact;
import com.entity.TouristMaster;
import com.service.ContactService;
import com.service.TouristService;

@RestController
public class TouristsController {

	@Autowired
	TouristService touristService;

	@Autowired
	ContactService contactService;
	
	@GetMapping(value = "/index")
	public ModelAndView addNewTourist() {
		ModelAndView mv = new ModelAndView("indexdata");
		return mv;
	}

	@PostMapping("/addTourist")
	public ModelAndView saveTourist(@RequestParam("touristName") String touristName,
			@RequestParam("address") String address, @RequestParam("tourDate") String tourDate,
			@RequestParam("bookingAmount") Double bookingAmount, @RequestParam("phoneNumber1") String phoneNumber1,
			@RequestParam("phoneNumber2") String phoneNumber2, @RequestParam("phoneNumber3") String phoneNumber3) {
		ModelAndView mv = new ModelAndView("saveddata");

		TouristMaster touristMaster = new TouristMaster();
		TouristContact touristContact = new TouristContact();
		TouristContact touristContact2 = new TouristContact();
		TouristContact touristContact3 = new TouristContact();

		//System.out.println(phoneNumber1);
		touristMaster.setName(touristName);
		touristMaster.setAddress(address);
		touristMaster.setDate(tourDate);
		touristMaster.setBookingAmount(bookingAmount);
		touristContact.setPhoneNumber(phoneNumber1);
		touristContact.setTourist(touristMaster);
		touristMaster.addContacts(touristContact);
		
		
		if (!phoneNumber2.equals("0")) {
			touristContact2.setPhoneNumber(phoneNumber2);
			touristContact2.setTourist(touristMaster);
			touristMaster.addContacts(touristContact2);
		}
		if (!phoneNumber3.equals("0")) {

			touristContact3.setPhoneNumber(phoneNumber3);
			touristContact3.setTourist(touristMaster);
			touristMaster.addContacts(touristContact3);
		}

		touristService.save(touristMaster);
		contactService.addNumber(touristContact);
		contactService.addNumber(touristContact2);
		contactService.addNumber(touristContact3);
		
		mv.addObject("touristContact", touristContact);
		mv.addObject("touristContact2", touristContact2);
		mv.addObject("touristContact3", touristContact3);
		mv.addObject("tourist", touristMaster);
		return mv;
	}

}