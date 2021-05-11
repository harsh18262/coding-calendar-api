package com.codingcalendar.codingcalendar.api.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingcalendar.codingcalendar.api.Entities.Contest;
import com.codingcalendar.codingcalendar.api.Entities.ContestRepository;

@Service
public class ApiServicesImpl implements ApiServices {

	
	
	@Autowired
	ContestRepository contestRepo;
	
	@Override
	 public Iterable<Contest>  getAllcontests() 
	{
		
		return contestRepo.findAll();
	}
}
