package com.codingcalendar.codingcalendar.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingcalendar.codingcalendar.api.Entities.Contest;
import com.codingcalendar.codingcalendar.api.Services.ApiServices;

@RestController
public class ApiController {
		
		
		@Autowired
		ApiServices apiservices;
	
		@GetMapping("/test")
		public String test()
		{
			return "test";
		}

		@GetMapping("/all")
		public Iterable<Contest> getall()
		{
			return  apiservices.getAllcontests();
		}
}
