package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entity.TouristMaster;
import com.service.TouristService;


@RestController
public class TouristsController {

	@Autowired
	TouristService service;
	
	@GetMapping(value = "/addTourist")
	public ModelAndView displayTouristDetails(TouristMaster tourist) {
	    ModelAndView mv = new ModelAndView("index");
		return mv;
	}	
	
	@GetMapping(value = "/touristDetails")
	public  ModelAndView touristDetails(Model model) {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("touristDetails",service.getData());
		return mv;	
	}
}
