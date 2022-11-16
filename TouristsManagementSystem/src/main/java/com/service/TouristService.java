package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.TouristMaster;
import com.repository.TouristRepository;

@Service
public class TouristService {

	@Autowired
	public TouristService(TouristRepository touristRepo) {
		super();
		this.touristRepo = touristRepo;
	}
	
	@Autowired
	private TouristRepository touristRepo;
	
	public List<TouristMaster> getData(){
		return touristRepo.findAll();
	}
	
	public void save(TouristMaster tourist) {
		touristRepo.save(tourist);
	}
	
}
