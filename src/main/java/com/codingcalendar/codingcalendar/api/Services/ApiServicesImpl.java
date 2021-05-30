package com.codingcalendar.codingcalendar.api.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

	@Override
	public Iterable<Contest> getby_platform_and_phase(String Platform,String Phase) {
		if (Platform==null)
		{
			Platform="%";
		}
		if(Phase==null)
		{
			Phase="%";
		}
		
		return contestRepo.findByPlatform_and_Phase(Platform,Phase);
	}
}
